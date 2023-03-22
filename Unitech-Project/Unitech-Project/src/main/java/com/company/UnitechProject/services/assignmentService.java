@Service
public class AssignmentService {

    @Autowired
    private AssignmentRepository assignmentRepository;

    public Assignment completeAssignment(Long id) {
        Assignment assignment = assignmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Assignment", "id", id));

        assignment.setStatus(AssignmentStatus.COMPLETED);
        assignment.setCompletedDate(LocalDate.now());

        return assignmentRepository.save(assignment);
    }

    public Assignment incompleteAssignment(Long id) {
        Assignment assignment = assignmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Assignment", "id", id));

        assignment.setStatus(AssignmentStatus.INCOMPLETE);
        assignment.setCompletedDate(null);

        return assignmentRepository.save(assignment);
    }

    public List<Assignment> delayedAssignment() {
        LocalDate today = LocalDate.now();
        List<Assignment> assignments = assignmentRepository.findByDueDateLessThanAndStatusNot(today, AssignmentStatus.COMPLETED);

        for (Assignment assignment : assignments) {
            assignment.setStatus(AssignmentStatus.DELAYED);
        }

        return assignmentRepository.saveAll(assignments);
    }
}

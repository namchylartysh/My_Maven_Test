public class Test {

//    @BeforeEach
//    public void restoreEmployeesList() {
//        List<EmployeeFields> baseFields = startingEmployeesParams();
//        Predicate<Integer> moreThen = i -> (i <= 7);
//        employees = employees.stream().filter(e -> moreThen.test(e.getId())).collect(Collectors.toList());
//        int minLength = Math.min(employees.size(), baseFields.size());
//        for (int i = 0; i < minLength; i++) {
//            dataBase.updateByFields(employees.get(i), baseFields.get(i));
//        }
//    }
// --------------------------------------------------------------
//    @ParameterizedTest
//    @MethodSource("dataForSearchingById")
//    public void testFindById(Employee target, int id, boolean result) {
//        Employee findedEmployee = dataBase.findById(id);
//        Assertions.assertEquals(result, target.equals(findedEmployee));
//    }

//    public static Stream<Arguments> dataForSearchingById() {
//        List<Arguments> out = new ArrayList<>();
//        out.add(Arguments.arguments(employees.get(0), 1, true));
//        out.add(Arguments.arguments(employees.get(5), 4, false));
//        out.add(Arguments.arguments(new Employee("Serg", "test", 1500, 59), 1, false));
//        out.add(Arguments.arguments(new Employee("Serg", "test", 1500, 59), 100, false));
//        return out.stream();
//    }

//    ----------------------------------------------------

    /*
        @ParameterizedTest
    @MethodSource("dataForUpdateEmployeeTest")
    public void updateEmployeeTest (Employee employee, EmployeeFields eF, EmployeeFields result, boolean[] results) {
        dataBase.updateByFields(employee, eF);
//        System.out.println(employee);
        Assertions.assertEquals(results[0], employee.getName().equals(result.getName()));
        Assertions.assertEquals(results[1], employee.getPosition().equals(result.getPosition()));
        Assertions.assertEquals(results[2], employee.getSalary() == result.getSalary());
        Assertions.assertEquals(results[3], employee.getAge() == (result.getAge()));
    }

    public static Stream<Arguments> dataForUpdateEmployeeTest() {
        List<Arguments> out = new ArrayList<>();
        EmployeeFields eF = new EmployeeFields(null, "BigBoss", 2001, 44);
        Employee employee = employees.get(0);
        EmployeeFields result = new EmployeeFields(employee.getName(), eF.getPosition(), eF.getSalary(), eF.getAge());
        boolean[] results = {true, true, true, true};
        out.add(Arguments.arguments(employee, eF, result, results));

        EmployeeFields ef1 = new EmployeeFields("Sergey", "Small Boss", 2002, 28);
        Employee employee1 = employees.get(1);
        EmployeeFields result1 = new EmployeeFields("Sergey", "Small Boss", 2002, 28);
        boolean[] results1 = {true, true, true, true};
        out.add(Arguments.arguments(employee1, ef1, result1, results1));

        EmployeeFields eF2 = new EmployeeFields("Sergey", "", -5, 31);
        Employee employee2 = employees.get(2);
        EmployeeFields result2 = new EmployeeFields("Sergey", employee2.getPosition(), employee2.getSalary(), 31);
        boolean[] results2 = {true, true, true, true};
        out.add(Arguments.arguments(employee2, eF2, result2, results2));

        return out.stream();
    }

    -------------------------------------------------------------------------

    --------------------------------------------------------------

        @ParameterizedTest
    @MethodSource("dataForCreateNewEmployeeTest")
    public void createNewEmployeeTest(EmployeeFields eFTarget) {
        int lastId = employees.get(employees.size()-1).getId();
        Employee newEmployee = DataUtil.createNewEmployee(eFTarget);
//        Employee.setCurrent(newEmployee.getId()-1);
        Assertions.assertTrue(lastId < newEmployee.getId(), "Id passed");
        Assertions.assertEquals(newEmployee.getName(), eFTarget.getName(), "Name passed");
        Assertions.assertEquals(newEmployee.getPosition(), eFTarget.getPosition(), "Position passed");
        Assertions.assertEquals(newEmployee.getSalary(), eFTarget.getSalary(), "Salary passed");
        Assertions.assertEquals(newEmployee.getAge(), eFTarget.getAge(), "Age passed");
    }


    public static Stream<Arguments> dataForCreateNewEmployeeTest() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new EmployeeFields("TestCreat", "tester", 1455, 18)));
        out.add(Arguments.arguments(new EmployeeFields("Test Creat", "tester boss", 2800, 25)));
        out.add(Arguments.arguments(new EmployeeFields("Test Creat", null, 2800, 25)));

        return out.stream();
    }








     */


}

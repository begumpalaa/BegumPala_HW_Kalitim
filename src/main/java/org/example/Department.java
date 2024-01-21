package org.example;
import java.util.ArrayList;
import java.util.List;

class Department {
    private Personnel teamLead;
    private List<Personnel> personnelList;
    private List<String> assignmentList;

    public Department(Personnel teamLead) {
        if (teamLead == null) {
            throw new IllegalArgumentException("Team lead cannot be null.");
        }
        this.teamLead = teamLead;
        this.personnelList = new ArrayList<>();
        this.assignmentList = new ArrayList<>();
    }

    public void changeTeamLead(Personnel newTeamLead) {
        if (newTeamLead != null) {
            this.teamLead = newTeamLead;
        } else {
            System.out.println("New team lead is not valid.");
        }
    }

    public void addPersonnel(Personnel person) {
        personnelList.add(person);
    }

    public void removePersonnel(Personnel person) {
        personnelList.remove(person);
    }

    public void changePersonnel(Personnel oldPerson, Personnel newPerson) {
        int index = personnelList.indexOf(oldPerson);
        if (index != -1) {
            personnelList.set(index, newPerson);
        } else {
            System.out.println("Person not found.");
        }
    }

    public void addTask(String task) {
        assignmentList.add(task);
    }

    public void markTaskAsCompleted(String task) {
        if (assignmentList.contains(task)) {
            assignmentList.remove(task);
            System.out.println("Task marked as completed: " + task);
        } else {
            System.out.println("Task not found.");
        }
    }
}

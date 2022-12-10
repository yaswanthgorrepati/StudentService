package com.yaswanth.StudentService;

public class ResponseMessage {

    private String message;
    private String code;
    private String StudentId;

    public ResponseMessage() {
    }

    public ResponseMessage(String message, String code, String studentId) {
        this.message = message;
        this.code = code;
        StudentId = studentId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }
}

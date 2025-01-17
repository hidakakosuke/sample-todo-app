package com.sample.todo.entity;

import java.io.Serializable;
/**データベースのテーブル構造に該当するクラス
 * TODO_APPテーブルに該当するエンティティクラス<br>
 * JavaBeansのルールに従っています。
 */

public class TodoApp implements Serializable {
    /**
     * おまじない
     */
    private static final long serialVersionUID = 1L;

    private int todoId;
    private String title;
    private String detail;
    private String deadline;
    private String category;

    public TodoApp() {
    }

    public int getTodoId() {
        return this.todoId;
    }

    public void setTodoId(int todoId) {
        this.todoId = todoId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDeadline() {
        return this.deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
    <head>
        <title>Welcome to ToDos page</title>
    </head>
    <body>
        <div>Welcome to Todos page ${name}</div>
        <div>Your todos: </div>
        <table>
            <thead>
                <tr>
                <th>id</th>
                <th>Username</th>
                <th>Description</th>
                <th>Target Date</th>
                <th>Is Done?</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${todoList}" var="todo">
                    <tr>
                        <td>${todo.id}</td>
                        <td>${todo.username}</td>
                        <td>${todo.description}</td>
                        <td>${todo.targetDate}</td>
                        <td>${todo.done}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
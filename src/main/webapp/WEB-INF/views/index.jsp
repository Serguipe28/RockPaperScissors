<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title> RockPaperScissors </title>
    </head>
    <body>
        <form:form action="oneTwoThree" method="post" modelAttribute="result">
            <select name="trie" id="trie">
                          <option value="Rock">Rock</option>
                          <option value="Paper">Paper</option>
                          <option value="Scissors">Scissors</option>
            </select>
            <input type="submit" value="play"/>
        </form:form>
        <div> ${result} </div>
    </body>
</html>
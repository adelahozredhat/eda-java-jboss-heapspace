<%
    java.util.List<byte[]> list = new java.util.ArrayList<>();
    while(true) {
        list.add(new byte[1024 * 1024]); // 1MB cada vez
    }
%>
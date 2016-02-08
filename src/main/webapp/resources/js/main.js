/**
 * Created by Vlad on 01.02.2016.
 */

$(document).ready(function(){
    $("#events").click(function(event) {
        event.preventDefault();
        $("#panel").html(
            function getData() {
                var xhr = new XMLHttpRequest();
                xhr.open('POST', '/eventsAjax', false);
                xhr.send();
                if (xhr.status != 200) {
                    alert(xhr.status + ': ' + xhr.statusText);
                } else {
                    //    alert(xhr.responseText)
                    return xhr.responseText

                    // document.getElementById("array").innerHTML = xhr.responseText;
                }
            }
        );
        history.pushState({}, '', '/main/events')
    });
});

$(document).ready(function(){
    $("#home").click(function(event) {
        event.preventDefault();
        $("#panel").html(
            function getData() {
                var xhr = new XMLHttpRequest();
                xhr.open('POST', '/homeAjax', false);
                xhr.send();
                if (xhr.status != 200) {
                    alert(xhr.status + ': ' + xhr.statusText);
                } else {

                    return xhr.responseText
                }
            }
        );

        history.pushState({}, '', '/main/home')
    });
});

$(document).ready(function(){
    $("#chatButton").click(function(event) {
        event.preventDefault();
        $("#panel").html(
            function getData() {
                var xhr = new XMLHttpRequest();
                xhr.open('POST', '/chatAjax', false);
                xhr.send();
                if (xhr.status != 200) {
                    alert(xhr.status + ': ' + xhr.statusText);
                } else {

                    return xhr.responseText
                }
            }
        );

        history.pushState({}, '', '/main/chat')
    });
});

$(document).ready(function(){
    var handler = function(event) {
        event.preventDefault();
        $("#ct-chart-ct-perfect-fourth").html(
            function getData() {
                var xhr = new XMLHttpRequest();
                xhr.open('POST', '/graphAjax', false);
                xhr.send();
                if (xhr.status != 200) {
                    alert(xhr.status + ': ' + xhr.statusText);
                } else {

                    return xhr.responseText
                }
            }
        );
    };

    $("#events").click(handler);
    $("#home").click(handler);
});
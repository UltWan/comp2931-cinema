function selectChange(x) {
	var e = document.getElementById(x);
}

function updateTotal() {
	total = 0.00;
	var aS = document.getElementById("adult_std_ticket_amt");
	var aSv = aS.options[aS.selectedIndex].value;

	var aV = document.getElementById("adult_vip_ticket_amt");
	var aVv = aV.options[aV.selectedIndex].value;

	var sS = document.getElementById("student_std_ticket_amt");
	var sSv = sS.options[sS.selectedIndex].value;

	var sV = document.getElementById("student_vip_ticket_amt");
	var sVv = sV.options[sV.selectedIndex].value;

	var cS = document.getElementById("child_std_ticket_amt");
	var cSv = cS.options[cS.selectedIndex].value;

	var cV = document.getElementById("child_vip_ticket_amt");
	var cVv = cV.options[cV.selectedIndex].value;

	var seS = document.getElementById("senior_std_ticket_amt");
	var seSv = seS.options[seS.selectedIndex].value;

	var seV = document.getElementById("senior_vip_ticket_amt");
	var seVv = seV.options[seV.selectedIndex].value;

	total = (aSv*10)+(aVv*20)+(sSv*7.50)+(sVv*15)+(cSv*6)+(sVv*12)+(seSv*6)+(seVv*12);
	document.getElementById('price').innerHTML = "Price £"+total;
	document.getElementById('totaltickets').value = (aSv*1)+(aVv*1)+(sSv*1)+(sVv*1)+(cSv*1)+(cVv*1)+(seSv*1)+(seVv*1);
}
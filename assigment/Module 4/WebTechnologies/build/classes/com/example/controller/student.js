function validateForm() {
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    const passwordRegex = /^(?=.*[A-Z])(?=.*[a-z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;

    const email = document.forms["studentForm"]["email"].value;
    const password = document.forms["studentForm"]["password"].value;

    if (!emailRegex.test(email)) {
        alert("Invalid email format.");
        return false;
    }
    
    if (!passwordRegex.test(password)) {
        alert("Password must be at least 8 characters long, contain upper and lower case letters, a number, and a special character.");
        return false;
    }

    return true;
}

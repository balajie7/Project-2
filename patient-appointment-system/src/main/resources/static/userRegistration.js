const form = document.getElementById('registrationForm');
form.addEventListener('submit', (e) => {
    e.preventDefault();
    const formData = new FormData(form);
    axios.post('/api/patients/register', {
        name: formData.get('name'),
        email: formData.get('email'),
        password: formData.get('password'),
        contact: formData.get('contact'),
        medicalHistory: formData.get('medicalHistory')
    }).then(response => {
        console.log('Registration successful', response.data);
    }).catch(error => {
        console.error('Registration failed', error);
    });
});

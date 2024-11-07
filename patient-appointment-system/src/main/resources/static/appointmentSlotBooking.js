function bookAppointment(slotId) {
    axios.post('/api/appointments/book', {
        patientId: 1,  // This should be dynamically fetched
        doctorId: 1,   // This should be dynamically fetched
        appointmentTime: slotId
    }).then(response => {
        alert('Appointment booked successfully');
    }).catch(error => {
        alert('Failed to book appointment');
    });
}

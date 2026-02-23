package service;

import model.person.Patient;
import model.person.User;
import model.order.MedicalOrder;
import model.order.OrderItem;
import model.enums.ItemType;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class CreateOrderService {

    private List<MedicalOrder> orders = new ArrayList<>();

    public MedicalOrder createOrder(int orderId, Patient patient, User doctor,
                                    String date, List<OrderItem> items,
                                    String dose, String duration) throws Exception {
        if (items == null || items.isEmpty()) {
            throw new Exception("La orden debe tener al menos un ítem");
        }

        Set<String> itemNames = new HashSet<>();
        for (OrderItem orderItem : items) {
            if (!itemNames.add(orderItem.getItem().getName())) {
                throw new Exception("La orden contiene ítems repetidos: " + orderItem.getItem().getName());
            }
        }

        for (MedicalOrder existingOrder : orders) {
            if (existingOrder.getPatient().equals(patient) && existingOrder.getDate().equals(date)) {
                throw new Exception("Ya existe una orden para este paciente en la fecha: " + date);
            }
        }

boolean hasDiagnostic = false;
for (OrderItem orderItem : items) {
    if (orderItem.getItem().getType() == ItemType.S) {
        if (hasDiagnostic) {
            throw new Exception("La orden no puede contener más de una ayuda diagnóstica");
        }
        hasDiagnostic = true;
    }
}


        MedicalOrder newOrder = new MedicalOrder(orderId, items, patient, doctor, date, dose, duration);
        orders.add(newOrder);
        return newOrder;
    }
}
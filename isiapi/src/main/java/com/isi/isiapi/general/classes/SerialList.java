package com.isi.isiapi.general.classes;

public class SerialList {

    private final int id;
    private final String serial_value;
    private final String commercial_local_id;
    private final int order_activated;
    private final String order_last_update;
    private final int order_guest_active;
    private final int reservation_active;
    private final int chat_active;
    private final int server_version;

    public SerialList(int id, String serial_value, String commercial_local_id, int order_activated, String order_last_update, int order_guest_active, int reservation_active, int chat_active, int server_version) {
        this.id = id;
        this.serial_value = serial_value;
        this.commercial_local_id = commercial_local_id;
        this.order_activated = order_activated;
        this.order_last_update = order_last_update;
        this.order_guest_active = order_guest_active;
        this.reservation_active = reservation_active;
        this.chat_active = chat_active;
        this.server_version = server_version;
    }

    public int getId() {
        return id;
    }

    public String getSerial_value() {
        return serial_value;
    }

    public String getCommercial_local_id() {
        return commercial_local_id;
    }

    public int getOrder_activated() {
        return order_activated;
    }

    public String getOrder_last_update() {
        return order_last_update;
    }

    public int getOrder_guest_active() {
        return order_guest_active;
    }

    public int getReservation_active() {
        return reservation_active;
    }

    public int getChat_active() {
        return chat_active;
    }

    public int getServer_version() {
        return server_version;
    }
}

abstract public class DeviceEntity {
    TypeofDeviceEntity typeofEntity;

    public DeviceEntity(TypeofDeviceEntity typeofEntity) {
        this.typeofEntity = typeofEntity;
    }
}

enum TypeofDeviceEntity {
    COMPUTER,
    ROUTER,
    NETWORKADAPTER,
    SWITCH,
    CONNECTION
}
public class DeviceFactory {
    /**
     * Creates a new Device with router, switch or computer configurations.
     * @param deviceName Name of the device to be created
     * @param macAddress MAC address of the device to be created
     * @return Returns created device.
     * @throws NotFound Thrown when provided entity type does not match with the type devices implemented.
     */
    public static Device getDevice(TypeofDeviceEntity typeofDeviceEntity, String deviceName, String macAddress) throws NotFound {
        return switch (typeofDeviceEntity) {
            case COMPUTER, ROUTER, SWITCH -> new Device(deviceName, typeofDeviceEntity, macAddress);
            default -> throw new NotFound("Device not found, please try with a valid device");
        };
    }
}

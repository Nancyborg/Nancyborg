/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package api.ax12;

public class AX12Base {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected AX12Base(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AX12Base obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AX12JNI.delete_AX12Base(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean readData(SWIGTYPE_p_uint8_t reg_start, SWIGTYPE_p_uint8_t len) {
    return AX12JNI.AX12Base_readData(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(reg_start), SWIGTYPE_p_uint8_t.getCPtr(len));
  }

  public boolean writeData(SWIGTYPE_p_uint8_t reg_start, SWIGTYPE_p_uint8_t len, SWIGTYPE_p_uint8_t data) {
    return AX12JNI.AX12Base_writeData(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(reg_start), SWIGTYPE_p_uint8_t.getCPtr(len), SWIGTYPE_p_uint8_t.getCPtr(data));
  }

  public int readRegister1(SWIGTYPE_p_uint8_t reg_start) {
    return AX12JNI.AX12Base_readRegister1(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(reg_start));
  }

  public int readRegister2(SWIGTYPE_p_uint8_t reg_start) {
    return AX12JNI.AX12Base_readRegister2(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(reg_start));
  }

  public boolean writeRegister1(SWIGTYPE_p_uint8_t reg_start, SWIGTYPE_p_uint8_t val) {
    return AX12JNI.AX12Base_writeRegister1(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(reg_start), SWIGTYPE_p_uint8_t.getCPtr(val));
  }

  public boolean writeRegister2(SWIGTYPE_p_uint8_t reg_start, SWIGTYPE_p_uint16_t val) {
    return AX12JNI.AX12Base_writeRegister2(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(reg_start), SWIGTYPE_p_uint16_t.getCPtr(val));
  }

  public void pingWait() {
    AX12JNI.AX12Base_pingWait(swigCPtr, this);
  }

  public boolean reset() {
    return AX12JNI.AX12Base_reset(swigCPtr, this);
  }

  public boolean ping() {
    return AX12JNI.AX12Base_ping(swigCPtr, this);
  }

  public float getPresentPosition() {
    return AX12JNI.AX12Base_getPresentPosition(swigCPtr, this);
  }

  public float getPresentSpeed() {
    return AX12JNI.AX12Base_getPresentSpeed(swigCPtr, this);
  }

  public boolean setGoalPosition(float angle, boolean block) {
    return AX12JNI.AX12Base_setGoalPosition__SWIG_0(swigCPtr, this, angle, block);
  }

  public boolean setGoalPosition(float angle) {
    return AX12JNI.AX12Base_setGoalPosition__SWIG_1(swigCPtr, this, angle);
  }

  public boolean setGoalSpeed(float speed) {
    return AX12JNI.AX12Base_setGoalSpeed(swigCPtr, this, speed);
  }

  public boolean setCWLimit(float angle) {
    return AX12JNI.AX12Base_setCWLimit(swigCPtr, this, angle);
  }

  public boolean setCCWLimit(float angle) {
    return AX12JNI.AX12Base_setCCWLimit(swigCPtr, this, angle);
  }

  public boolean setTorqueEnable(boolean enable) {
    return AX12JNI.AX12Base_setTorqueEnable(swigCPtr, this, enable);
  }

  public boolean changeID(SWIGTYPE_p_uint8_t new_id) {
    return AX12JNI.AX12Base_changeID(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(new_id));
  }

  public boolean changeBaud(int new_baud) {
    return AX12JNI.AX12Base_changeBaud(swigCPtr, this, new_baud);
  }

  public void setCurrentID(SWIGTYPE_p_uint8_t new_id) {
    AX12JNI.AX12Base_setCurrentID(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(new_id));
  }

  public void setCurrentBaud(SWIGTYPE_p_uint8_t new_baud) {
    AX12JNI.AX12Base_setCurrentBaud(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(new_baud));
  }

  public boolean isMoving() {
    return AX12JNI.AX12Base_isMoving(swigCPtr, this);
  }

  public SWIGTYPE_p_uint8_t getData() {
    long cPtr = AX12JNI.AX12Base_getData(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint8_t(cPtr, false);
  }

  public SWIGTYPE_p_uint8_t getDataSize() {
    return new SWIGTYPE_p_uint8_t(AX12JNI.AX12Base_getDataSize(swigCPtr, this), true);
  }

  public int getErrors() {
    return AX12JNI.AX12Base_getErrors(swigCPtr, this);
  }

  public SWIGTYPE_p_uint8_t getReceiverId() {
    return new SWIGTYPE_p_uint8_t(AX12JNI.AX12Base_getReceiverId(swigCPtr, this), true);
  }

  public int getCommError() {
    return AX12JNI.AX12Base_getCommError(swigCPtr, this);
  }

  public boolean writePacket(SWIGTYPE_p_uint8_t instr, SWIGTYPE_p_uint8_t len, SWIGTYPE_p_uint8_t data) {
    return AX12JNI.AX12Base_writePacket(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(instr), SWIGTYPE_p_uint8_t.getCPtr(len), SWIGTYPE_p_uint8_t.getCPtr(data));
  }

  public static SWIGTYPE_p_uint16_t degToRegVal(float val) {
    return new SWIGTYPE_p_uint16_t(AX12JNI.AX12Base_degToRegVal(val), true);
  }

  public static float regValToDeg(SWIGTYPE_p_uint16_t deg) {
    return AX12JNI.AX12Base_regValToDeg(SWIGTYPE_p_uint16_t.getCPtr(deg));
  }

  public static float regValToFloat(SWIGTYPE_p_uint16_t val) {
    return AX12JNI.AX12Base_regValToFloat(SWIGTYPE_p_uint16_t.getCPtr(val));
  }

  public static SWIGTYPE_p_uint16_t floatToRegVal(float val) {
    return new SWIGTYPE_p_uint16_t(AX12JNI.AX12Base_floatToRegVal(val), true);
  }

  public final static int AX12_BROADCAST = AX12JNI.AX12Base_AX12_BROADCAST_get();
  public final static class AX12_Instr {
    public final static AX12_Instr AX12_INSTR_PING = new AX12_Instr("AX12_INSTR_PING", AX12JNI.AX12Base_AX12_INSTR_PING_get());
    public final static AX12_Instr AX12_INSTR_READ_DATA = new AX12_Instr("AX12_INSTR_READ_DATA", AX12JNI.AX12Base_AX12_INSTR_READ_DATA_get());
    public final static AX12_Instr AX12_INSTR_WRITE_DATA = new AX12_Instr("AX12_INSTR_WRITE_DATA", AX12JNI.AX12Base_AX12_INSTR_WRITE_DATA_get());
    public final static AX12_Instr AX12_INSTR_RESET = new AX12_Instr("AX12_INSTR_RESET", AX12JNI.AX12Base_AX12_INSTR_RESET_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static AX12_Instr swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + AX12_Instr.class + " with value " + swigValue);
    }

    private AX12_Instr(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private AX12_Instr(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private AX12_Instr(String swigName, AX12_Instr swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static AX12_Instr[] swigValues = { AX12_INSTR_PING, AX12_INSTR_READ_DATA, AX12_INSTR_WRITE_DATA, AX12_INSTR_RESET };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class AX12_Register {
    public final static AX12_Register AX12_ROM_MODEL_NUMBER = new AX12_Register("AX12_ROM_MODEL_NUMBER", AX12JNI.AX12Base_AX12_ROM_MODEL_NUMBER_get());
    public final static AX12_Register AX12_ROM_FIRMWARE_VERSION = new AX12_Register("AX12_ROM_FIRMWARE_VERSION", AX12JNI.AX12Base_AX12_ROM_FIRMWARE_VERSION_get());
    public final static AX12_Register AX12_ROM_ID = new AX12_Register("AX12_ROM_ID", AX12JNI.AX12Base_AX12_ROM_ID_get());
    public final static AX12_Register AX12_ROM_BAUD_RATE = new AX12_Register("AX12_ROM_BAUD_RATE", AX12JNI.AX12Base_AX12_ROM_BAUD_RATE_get());
    public final static AX12_Register AX12_ROM_RETURN_DELAY_TIME = new AX12_Register("AX12_ROM_RETURN_DELAY_TIME", AX12JNI.AX12Base_AX12_ROM_RETURN_DELAY_TIME_get());
    public final static AX12_Register AX12_ROM_CW_ANGLE_LIMIT = new AX12_Register("AX12_ROM_CW_ANGLE_LIMIT", AX12JNI.AX12Base_AX12_ROM_CW_ANGLE_LIMIT_get());
    public final static AX12_Register AX12_ROM_CCW_ANGLE_LIMIT = new AX12_Register("AX12_ROM_CCW_ANGLE_LIMIT", AX12JNI.AX12Base_AX12_ROM_CCW_ANGLE_LIMIT_get());
    public final static AX12_Register AX12_ROM_HIGH_TEMP_LIMIT = new AX12_Register("AX12_ROM_HIGH_TEMP_LIMIT", AX12JNI.AX12Base_AX12_ROM_HIGH_TEMP_LIMIT_get());
    public final static AX12_Register AX12_ROM_LOW_VOLTAGE_LIMIT = new AX12_Register("AX12_ROM_LOW_VOLTAGE_LIMIT", AX12JNI.AX12Base_AX12_ROM_LOW_VOLTAGE_LIMIT_get());
    public final static AX12_Register AX12_ROM_HIGH_VOLTAGE_LIMIT = new AX12_Register("AX12_ROM_HIGH_VOLTAGE_LIMIT", AX12JNI.AX12Base_AX12_ROM_HIGH_VOLTAGE_LIMIT_get());
    public final static AX12_Register AX12_ROM_MAX_TORQUE = new AX12_Register("AX12_ROM_MAX_TORQUE", AX12JNI.AX12Base_AX12_ROM_MAX_TORQUE_get());
    public final static AX12_Register AX12_ROM_STATUS_RETURN_LEVEL = new AX12_Register("AX12_ROM_STATUS_RETURN_LEVEL", AX12JNI.AX12Base_AX12_ROM_STATUS_RETURN_LEVEL_get());
    public final static AX12_Register AX12_ROM_ALARM_LED = new AX12_Register("AX12_ROM_ALARM_LED", AX12JNI.AX12Base_AX12_ROM_ALARM_LED_get());
    public final static AX12_Register AX12_ROM_ALARM_SHUTDOWN = new AX12_Register("AX12_ROM_ALARM_SHUTDOWN", AX12JNI.AX12Base_AX12_ROM_ALARM_SHUTDOWN_get());
    public final static AX12_Register AX12_ROM_DOWN_CALIBRATION = new AX12_Register("AX12_ROM_DOWN_CALIBRATION", AX12JNI.AX12Base_AX12_ROM_DOWN_CALIBRATION_get());
    public final static AX12_Register AX12_ROM_UP_CALIBRATION = new AX12_Register("AX12_ROM_UP_CALIBRATION", AX12JNI.AX12Base_AX12_ROM_UP_CALIBRATION_get());
    public final static AX12_Register AX12_RAM_TORQUE_ENABLE = new AX12_Register("AX12_RAM_TORQUE_ENABLE", AX12JNI.AX12Base_AX12_RAM_TORQUE_ENABLE_get());
    public final static AX12_Register AX12_RAM_LED = new AX12_Register("AX12_RAM_LED", AX12JNI.AX12Base_AX12_RAM_LED_get());
    public final static AX12_Register AX12_RAM_CW_COMPILANCE_MARGIN = new AX12_Register("AX12_RAM_CW_COMPILANCE_MARGIN", AX12JNI.AX12Base_AX12_RAM_CW_COMPILANCE_MARGIN_get());
    public final static AX12_Register AX12_RAM_CCW_COMPILANCE_MARGIN = new AX12_Register("AX12_RAM_CCW_COMPILANCE_MARGIN", AX12JNI.AX12Base_AX12_RAM_CCW_COMPILANCE_MARGIN_get());
    public final static AX12_Register AX12_RAM_CW_COMPILANCE_SLOPE = new AX12_Register("AX12_RAM_CW_COMPILANCE_SLOPE", AX12JNI.AX12Base_AX12_RAM_CW_COMPILANCE_SLOPE_get());
    public final static AX12_Register AX12_RAM_CCW_COMPILANCE_SLOPE = new AX12_Register("AX12_RAM_CCW_COMPILANCE_SLOPE", AX12JNI.AX12Base_AX12_RAM_CCW_COMPILANCE_SLOPE_get());
    public final static AX12_Register AX12_RAM_GOAL_POSITION = new AX12_Register("AX12_RAM_GOAL_POSITION", AX12JNI.AX12Base_AX12_RAM_GOAL_POSITION_get());
    public final static AX12_Register AX12_RAM_MOVING_SPEED = new AX12_Register("AX12_RAM_MOVING_SPEED", AX12JNI.AX12Base_AX12_RAM_MOVING_SPEED_get());
    public final static AX12_Register AX12_RAM_TORQUE_LIMIT = new AX12_Register("AX12_RAM_TORQUE_LIMIT", AX12JNI.AX12Base_AX12_RAM_TORQUE_LIMIT_get());
    public final static AX12_Register AX12_RAM_PRESENT_POSITION = new AX12_Register("AX12_RAM_PRESENT_POSITION", AX12JNI.AX12Base_AX12_RAM_PRESENT_POSITION_get());
    public final static AX12_Register AX12_RAM_PRESENT_SPEED = new AX12_Register("AX12_RAM_PRESENT_SPEED", AX12JNI.AX12Base_AX12_RAM_PRESENT_SPEED_get());
    public final static AX12_Register AX12_RAM_PRESENT_LOAD = new AX12_Register("AX12_RAM_PRESENT_LOAD", AX12JNI.AX12Base_AX12_RAM_PRESENT_LOAD_get());
    public final static AX12_Register AX12_RAM_PRESENT_VOLTAGE = new AX12_Register("AX12_RAM_PRESENT_VOLTAGE", AX12JNI.AX12Base_AX12_RAM_PRESENT_VOLTAGE_get());
    public final static AX12_Register AX12_RAM_PRESENT_TEMPERATURE = new AX12_Register("AX12_RAM_PRESENT_TEMPERATURE", AX12JNI.AX12Base_AX12_RAM_PRESENT_TEMPERATURE_get());
    public final static AX12_Register AX12_RAM_REGISTERED_INSTRUCTION = new AX12_Register("AX12_RAM_REGISTERED_INSTRUCTION", AX12JNI.AX12Base_AX12_RAM_REGISTERED_INSTRUCTION_get());
    public final static AX12_Register AX12_RAM_MOVING = new AX12_Register("AX12_RAM_MOVING", AX12JNI.AX12Base_AX12_RAM_MOVING_get());
    public final static AX12_Register AX12_RAM_LOCK = new AX12_Register("AX12_RAM_LOCK", AX12JNI.AX12Base_AX12_RAM_LOCK_get());
    public final static AX12_Register AX12_RAM_PUNCH = new AX12_Register("AX12_RAM_PUNCH", AX12JNI.AX12Base_AX12_RAM_PUNCH_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static AX12_Register swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + AX12_Register.class + " with value " + swigValue);
    }

    private AX12_Register(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private AX12_Register(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private AX12_Register(String swigName, AX12_Register swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static AX12_Register[] swigValues = { AX12_ROM_MODEL_NUMBER, AX12_ROM_FIRMWARE_VERSION, AX12_ROM_ID, AX12_ROM_BAUD_RATE, AX12_ROM_RETURN_DELAY_TIME, AX12_ROM_CW_ANGLE_LIMIT, AX12_ROM_CCW_ANGLE_LIMIT, AX12_ROM_HIGH_TEMP_LIMIT, AX12_ROM_LOW_VOLTAGE_LIMIT, AX12_ROM_HIGH_VOLTAGE_LIMIT, AX12_ROM_MAX_TORQUE, AX12_ROM_STATUS_RETURN_LEVEL, AX12_ROM_ALARM_LED, AX12_ROM_ALARM_SHUTDOWN, AX12_ROM_DOWN_CALIBRATION, AX12_ROM_UP_CALIBRATION, AX12_RAM_TORQUE_ENABLE, AX12_RAM_LED, AX12_RAM_CW_COMPILANCE_MARGIN, AX12_RAM_CCW_COMPILANCE_MARGIN, AX12_RAM_CW_COMPILANCE_SLOPE, AX12_RAM_CCW_COMPILANCE_SLOPE, AX12_RAM_GOAL_POSITION, AX12_RAM_MOVING_SPEED, AX12_RAM_TORQUE_LIMIT, AX12_RAM_PRESENT_POSITION, AX12_RAM_PRESENT_SPEED, AX12_RAM_PRESENT_LOAD, AX12_RAM_PRESENT_VOLTAGE, AX12_RAM_PRESENT_TEMPERATURE, AX12_RAM_REGISTERED_INSTRUCTION, AX12_RAM_MOVING, AX12_RAM_LOCK, AX12_RAM_PUNCH };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class AX12_Error {
    public final static AX12_Error AX12_ERROR_NONE = new AX12_Error("AX12_ERROR_NONE", AX12JNI.AX12Base_AX12_ERROR_NONE_get());
    public final static AX12_Error AX12_ERROR_INPUT_VOLTAGE = new AX12_Error("AX12_ERROR_INPUT_VOLTAGE", AX12JNI.AX12Base_AX12_ERROR_INPUT_VOLTAGE_get());
    public final static AX12_Error AX12_ERROR_ANGLE_LIMIT = new AX12_Error("AX12_ERROR_ANGLE_LIMIT", AX12JNI.AX12Base_AX12_ERROR_ANGLE_LIMIT_get());
    public final static AX12_Error AX12_ERROR_OVERHEATING = new AX12_Error("AX12_ERROR_OVERHEATING", AX12JNI.AX12Base_AX12_ERROR_OVERHEATING_get());
    public final static AX12_Error AX12_ERROR_RANGE = new AX12_Error("AX12_ERROR_RANGE", AX12JNI.AX12Base_AX12_ERROR_RANGE_get());
    public final static AX12_Error AX12_ERROR_CHECKSUM = new AX12_Error("AX12_ERROR_CHECKSUM", AX12JNI.AX12Base_AX12_ERROR_CHECKSUM_get());
    public final static AX12_Error AX12_ERROR_OVERLOAD = new AX12_Error("AX12_ERROR_OVERLOAD", AX12JNI.AX12Base_AX12_ERROR_OVERLOAD_get());
    public final static AX12_Error AX12_ERROR_INSTRUCTION = new AX12_Error("AX12_ERROR_INSTRUCTION", AX12JNI.AX12Base_AX12_ERROR_INSTRUCTION_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static AX12_Error swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + AX12_Error.class + " with value " + swigValue);
    }

    private AX12_Error(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private AX12_Error(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private AX12_Error(String swigName, AX12_Error swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static AX12_Error[] swigValues = { AX12_ERROR_NONE, AX12_ERROR_INPUT_VOLTAGE, AX12_ERROR_ANGLE_LIMIT, AX12_ERROR_OVERHEATING, AX12_ERROR_RANGE, AX12_ERROR_CHECKSUM, AX12_ERROR_OVERLOAD, AX12_ERROR_INSTRUCTION };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class AX12_Comm_Error {
    public final static AX12_Comm_Error AX12_COMM_ERROR_NONE = new AX12_Comm_Error("AX12_COMM_ERROR_NONE", AX12JNI.AX12Base_AX12_COMM_ERROR_NONE_get());
    public final static AX12_Comm_Error AX12_COMM_ERROR_CHECKSUM = new AX12_Comm_Error("AX12_COMM_ERROR_CHECKSUM", AX12JNI.AX12Base_AX12_COMM_ERROR_CHECKSUM_get());
    public final static AX12_Comm_Error AX12_COMM_ERROR_TIMEOUT = new AX12_Comm_Error("AX12_COMM_ERROR_TIMEOUT", AX12JNI.AX12Base_AX12_COMM_ERROR_TIMEOUT_get());
    public final static AX12_Comm_Error AX12_COMM_ERROR_FORMAT = new AX12_Comm_Error("AX12_COMM_ERROR_FORMAT", AX12JNI.AX12Base_AX12_COMM_ERROR_FORMAT_get());
    public final static AX12_Comm_Error AX12_COMM_ERROR_ID = new AX12_Comm_Error("AX12_COMM_ERROR_ID", AX12JNI.AX12Base_AX12_COMM_ERROR_ID_get());
    public final static AX12_Comm_Error AX12_COMM_ERROR_SYSTEM = new AX12_Comm_Error("AX12_COMM_ERROR_SYSTEM", AX12JNI.AX12Base_AX12_COMM_ERROR_SYSTEM_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static AX12_Comm_Error swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + AX12_Comm_Error.class + " with value " + swigValue);
    }

    private AX12_Comm_Error(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private AX12_Comm_Error(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private AX12_Comm_Error(String swigName, AX12_Comm_Error swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static AX12_Comm_Error[] swigValues = { AX12_COMM_ERROR_NONE, AX12_COMM_ERROR_CHECKSUM, AX12_COMM_ERROR_TIMEOUT, AX12_COMM_ERROR_FORMAT, AX12_COMM_ERROR_ID, AX12_COMM_ERROR_SYSTEM };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}

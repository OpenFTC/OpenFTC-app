// Copyright 2016 Google Inc.

package com.google.blocks.ftcrobotcontroller.runtime;

import android.webkit.JavascriptInterface;

import com.google.blocks.ftcrobotcontroller.util.HardwareItem;
import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cCompassSensor;
import com.qualcomm.robotcore.hardware.CompassSensor.CompassMode;
import com.qualcomm.robotcore.hardware.HardwareDevice;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.I2cAddr;
import com.qualcomm.robotcore.util.RobotLog;

import org.firstinspires.ftc.robotcore.external.navigation.Acceleration;
import org.firstinspires.ftc.robotcore.external.navigation.MagneticFlux;

import java.util.Locale;

import junit.framework.Assert;

/**
 * A class that provides JavaScript access to a {@link ModernRoboticsI2cCompassSensor}.
 *
 * @author lizlooney@google.com (Liz Looney)
 */
class MrI2cCompassSensorAccess extends HardwareAccess<ModernRoboticsI2cCompassSensor> {
    private final ModernRoboticsI2cCompassSensor mrI2cCompassSensor;

    MrI2cCompassSensorAccess(BlocksOpMode blocksOpMode, HardwareItem hardwareItem,
                             HardwareMap hardwareMap, Class<? extends HardwareDevice> deviceType) {
        super(blocksOpMode, hardwareItem, hardwareMap, ModernRoboticsI2cCompassSensor.class);
        Assert.assertTrue(deviceType == ModernRoboticsI2cCompassSensor.class);
        this.mrI2cCompassSensor = hardwareDevice;
    }

    @SuppressWarnings("unused")
    @JavascriptInterface
    @Block(classes = {ModernRoboticsI2cCompassSensor.class}, methodName = "getDirection")
    public double getDirection() {
        checkIfStopRequested();
        if (mrI2cCompassSensor != null) {
            return mrI2cCompassSensor.getDirection();
        }
        return 0.0;
    }

    @SuppressWarnings("unused")
    @JavascriptInterface
    @Block(classes = {ModernRoboticsI2cCompassSensor.class}, methodName = "setI2cAddress")
    public void setI2cAddress7Bit(int i2cAddr7Bit) {
        checkIfStopRequested();
        if (mrI2cCompassSensor != null) {
            mrI2cCompassSensor.setI2cAddress(I2cAddr.create7bit(i2cAddr7Bit));
        }
    }

    @SuppressWarnings("unused")
    @JavascriptInterface
    @Block(classes = {ModernRoboticsI2cCompassSensor.class}, methodName = "getI2cAddress")
    public int getI2cAddress7Bit() {
        checkIfStopRequested();
        if (mrI2cCompassSensor != null) {
            I2cAddr i2cAddr = mrI2cCompassSensor.getI2cAddress();
            if (i2cAddr != null) {
                return i2cAddr.get7Bit();
            }
        }
        return 0;
    }

    @SuppressWarnings("unused")
    @JavascriptInterface
    @Block(classes = {ModernRoboticsI2cCompassSensor.class}, methodName = "setI2cAddress")
    public void setI2cAddress8Bit(int i2cAddr8Bit) {
        checkIfStopRequested();
        if (mrI2cCompassSensor != null) {
            mrI2cCompassSensor.setI2cAddress(I2cAddr.create8bit(i2cAddr8Bit));
        }
    }

    @SuppressWarnings("unused")
    @JavascriptInterface
    @Block(classes = {ModernRoboticsI2cCompassSensor.class}, methodName = "getI2cAddress")
    public int getI2cAddress8Bit() {
        checkIfStopRequested();
        if (mrI2cCompassSensor != null) {
            I2cAddr i2cAddr = mrI2cCompassSensor.getI2cAddress();
            if (i2cAddr != null) {
                return i2cAddr.get8Bit();
            }
        }
        return 0;
    }

    @SuppressWarnings("unused")
    @JavascriptInterface
    @Block(classes = {ModernRoboticsI2cCompassSensor.class}, methodName = "getAcceleration")
    public double getXAccel() {
        checkIfStopRequested();
        if (mrI2cCompassSensor != null) {
            Acceleration acceleration = mrI2cCompassSensor.getAcceleration();
            if (acceleration != null) {
                return acceleration.xAccel;
            }
        }
        return 0.0;
    }

    @SuppressWarnings("unused")
    @JavascriptInterface
    @Block(classes = {ModernRoboticsI2cCompassSensor.class}, methodName = "getAcceleration")
    public double getYAccel() {
        checkIfStopRequested();
        if (mrI2cCompassSensor != null) {
            Acceleration acceleration = mrI2cCompassSensor.getAcceleration();
            if (acceleration != null) {
                return acceleration.yAccel;
            }
        }
        return 0.0;
    }

    @SuppressWarnings("unused")
    @JavascriptInterface
    @Block(classes = {ModernRoboticsI2cCompassSensor.class}, methodName = "getAcceleration")
    public double getZAccel() {
        checkIfStopRequested();
        if (mrI2cCompassSensor != null) {
            Acceleration acceleration = mrI2cCompassSensor.getAcceleration();
            if (acceleration != null) {
                return acceleration.zAccel;
            }
        }
        return 0.0;
    }

    @SuppressWarnings("unused")
    @JavascriptInterface
    @Block(classes = {ModernRoboticsI2cCompassSensor.class}, methodName = "getMagneticFlux")
    public double getXMagneticFlux() {
        checkIfStopRequested();
        if (mrI2cCompassSensor != null) {
            MagneticFlux magneticFlux = mrI2cCompassSensor.getMagneticFlux();
            if (magneticFlux != null) {
                return magneticFlux.x;
            }
        }
        return 0.0;
    }

    @SuppressWarnings("unused")
    @JavascriptInterface
    @Block(classes = {ModernRoboticsI2cCompassSensor.class}, methodName = "getMagneticFlux")
    public double getYMagneticFlux() {
        checkIfStopRequested();
        if (mrI2cCompassSensor != null) {
            MagneticFlux magneticFlux = mrI2cCompassSensor.getMagneticFlux();
            if (magneticFlux != null) {
                return magneticFlux.y;
            }
        }
        return 0.0;
    }

    @SuppressWarnings("unused")
    @JavascriptInterface
    @Block(classes = {ModernRoboticsI2cCompassSensor.class}, methodName = "getMagneticFlux")
    public double getZMagneticFlux() {
        checkIfStopRequested();
        if (mrI2cCompassSensor != null) {
            MagneticFlux magneticFlux = mrI2cCompassSensor.getMagneticFlux();
            if (magneticFlux != null) {
                return magneticFlux.z;
            }
        }
        return 0.0;
    }

    @SuppressWarnings("unused")
    @JavascriptInterface
    @Block(classes = {ModernRoboticsI2cCompassSensor.class}, methodName = "setMode")
    public void setMode(String compassModeString) {
        checkIfStopRequested();
        try {
            if (mrI2cCompassSensor != null) {
                CompassMode compassMode = CompassMode.valueOf(compassModeString.toUpperCase(Locale.ENGLISH));
                mrI2cCompassSensor.setMode(compassMode);
            }
        } catch (Exception e) {
            RobotLog.e("MrI2cCompassSensor.setMode - caught " + e);
        }
    }

    @SuppressWarnings("unused")
    @JavascriptInterface
    @Block(classes = {ModernRoboticsI2cCompassSensor.class}, methodName = "isCalibrating")
    public boolean isCalibrating() {
        checkIfStopRequested();
        if (mrI2cCompassSensor != null) {
            return mrI2cCompassSensor.isCalibrating();
        }
        return false;
    }

    @SuppressWarnings("unused")
    @JavascriptInterface
    @Block(classes = {ModernRoboticsI2cCompassSensor.class}, methodName = "calibrationFailed")
    public boolean calibrationFailed() {
        checkIfStopRequested();
        if (mrI2cCompassSensor != null) {
            return mrI2cCompassSensor.calibrationFailed();
        }
        return false;
    }
}

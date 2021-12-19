package com.bytedance.netecho.result;

import com.bytedance.covode.number.Covode;

public final class TcpDetectResult extends Result {
    private final int errorCode;
    private final int errorStage;
    private final boolean success;

    static {
        Covode.recordClassIndex(25154);
    }

    public static /* synthetic */ TcpDetectResult copy$default(TcpDetectResult tcpDetectResult, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = tcpDetectResult.success;
        }
        if ((i3 & 2) != 0) {
            i = tcpDetectResult.errorStage;
        }
        if ((i3 & 4) != 0) {
            i2 = tcpDetectResult.errorCode;
        }
        return tcpDetectResult.copy(z, i, i2);
    }

    public final boolean component1() {
        return this.success;
    }

    public final int component2() {
        return this.errorStage;
    }

    public final int component3() {
        return this.errorCode;
    }

    public final TcpDetectResult copy(boolean z, int i, int i2) {
        return new TcpDetectResult(z, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TcpDetectResult) {
                TcpDetectResult tcpDetectResult = (TcpDetectResult) obj;
                if (!(this.success == tcpDetectResult.success && this.errorStage == tcpDetectResult.errorStage && this.errorCode == tcpDetectResult.errorCode)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.success;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return (((i * 31) + this.errorStage) * 31) + this.errorCode;
    }

    public final String toString() {
        return "TcpDetectResult(success=" + this.success + ", errorStage=" + this.errorStage + ", errorCode=" + this.errorCode + ")";
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final int getErrorStage() {
        return this.errorStage;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public TcpDetectResult(boolean z, int i, int i2) {
        this.success = z;
        this.errorStage = i;
        this.errorCode = i2;
    }
}

package com.p2082ss.ttvideoengine;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.p4417j.C86537q;

/* renamed from: com.ss.ttvideoengine.v */
public enum EnumC86649v {
    Undefine("", ""),
    Standard("360p", "medium"),
    High("480p", "higher"),
    SuperHigh("720p", "highest"),
    ExtremelyHigh("1080p", "original"),
    FourK("4k", ""),
    HDR("hdr", ""),
    Auto("auto", ""),
    L_Standard("240p", ""),
    H_High("540p", ""),
    TwoK("2k", ""),
    ExtremelyHigh_50F("1080p 50fps", ""),
    TwoK_50F("2k 50fps", ""),
    FourK_50F("4k 50fps", ""),
    ExtremelyHigh_60F("1080p 60fps", ""),
    TwoK_60F("2k 60fps", ""),
    FourK_60F("4k 60fps", ""),
    ExtremelyHigh_120F("1080p 120fps", ""),
    TwoK_120F("2k 120fps", ""),
    FourK_120F("4k 120fps", ""),
    L_Standard_HDR("240p HDR", ""),
    Standard_HDR("360p HDR", ""),
    High_HDR("480p HDR", ""),
    H_High_HDR("540p HDR", ""),
    SuperHigh_HDR("720p HDR", ""),
    ExtremelyHigh_HDR("1080p HDR", ""),
    TwoK_HDR("2k HDR", ""),
    FourK_HDR("4k HDR", "");
    

    /* renamed from: a */
    private final String f195302a;

    /* renamed from: b */
    private final String f195303b;

    public final String toString() {
        return this.f195302a;
    }

    public final int getIndex() {
        return ordinal();
    }

    public static EnumC86649v[] getAllResolutions() {
        try {
            return new EnumC86649v[]{Undefine, L_Standard, Standard, High, H_High, SuperHigh, ExtremelyHigh, ExtremelyHigh_50F, ExtremelyHigh_60F, ExtremelyHigh_120F, HDR, TwoK, TwoK_50F, TwoK_60F, TwoK_120F, FourK, FourK_50F, FourK_60F, FourK_120F, L_Standard_HDR, Standard_HDR, High_HDR, H_High_HDR, SuperHigh_HDR, ExtremelyHigh_HDR, TwoK_HDR, FourK_HDR};
        } catch (Exception unused) {
            return new EnumC86649v[0];
        }
    }

    static {
        Covode.recordClassIndex(101877);
    }

    public static EnumC86649v valueOf(int i) {
        EnumC86649v vVar = Undefine;
        if (i < vVar.ordinal() || i > FourK_HDR.ordinal()) {
            return vVar;
        }
        return values()[i];
    }

    public final String toString(int i) {
        if (i == C86537q.f194868b) {
            return this.f195303b;
        }
        if (i == C86537q.f194867a) {
            return this.f195302a;
        }
        return "";
    }

    public static String toString(EnumC86649v vVar) {
        if (vVar == null || vVar == Undefine) {
            return "Undefine";
        }
        if (vVar == Standard) {
            return "Standard";
        }
        if (vVar == High) {
            return "High";
        }
        if (vVar == SuperHigh) {
            return "SuperHigh";
        }
        if (vVar == FourK) {
            return "FourK";
        }
        if (vVar == HDR) {
            return "HDR";
        }
        if (vVar == Auto) {
            return "Auto";
        }
        if (vVar == L_Standard) {
            return "L_Standard";
        }
        if (vVar == H_High) {
            return "H_High";
        }
        if (vVar == TwoK) {
            return "TwoK";
        }
        if (vVar == ExtremelyHigh_50F) {
            return "ExtremelyHigh_50F";
        }
        if (vVar == TwoK_50F) {
            return "TwoK_50F";
        }
        if (vVar == FourK_50F) {
            return "FourK_50F";
        }
        if (vVar == ExtremelyHigh_60F) {
            return "ExtremelyHigh_60F";
        }
        if (vVar == TwoK_60F) {
            return "TwoK_60F";
        }
        if (vVar == FourK_60F) {
            return "FourK_60F";
        }
        if (vVar == ExtremelyHigh_120F) {
            return "ExtremelyHigh_120F";
        }
        if (vVar == TwoK_120F) {
            return "TwoK_120F";
        }
        if (vVar == FourK_120F) {
            return "FourK_120F";
        }
        if (vVar == L_Standard_HDR) {
            return "L_Standard_HDR";
        }
        if (vVar == Standard_HDR) {
            return "Standard_HDR";
        }
        if (vVar == High_HDR) {
            return "High_HDR";
        }
        if (vVar == H_High_HDR) {
            return "H_High_HDR";
        }
        if (vVar == SuperHigh_HDR) {
            return "SuperHigh_HDR";
        }
        if (vVar == ExtremelyHigh_HDR) {
            return "ExtremelyHigh_HDR";
        }
        if (vVar == TwoK_HDR) {
            return "TwoK_HDR";
        }
        if (vVar == FourK_HDR) {
            return "FourK_HDR";
        }
        return "Undefine";
    }

    public static EnumC86649v forString(String str) {
        if (TextUtils.isEmpty(str)) {
            return Undefine;
        }
        if (str.equals("Undefine")) {
            return Undefine;
        }
        if (str.equals("Standard")) {
            return Standard;
        }
        if (str.equals("High")) {
            return High;
        }
        if (str.equals("SuperHigh")) {
            return SuperHigh;
        }
        if (str.equals("FourK")) {
            return FourK;
        }
        if (str.equals("HDR")) {
            return HDR;
        }
        if (str.equals("Auto")) {
            return Auto;
        }
        if (str.equals("L_Standard")) {
            return L_Standard;
        }
        if (str.equals("H_High")) {
            return H_High;
        }
        if (str.equals("TwoK")) {
            return TwoK;
        }
        if (str.equals("ExtremelyHigh_50F")) {
            return ExtremelyHigh_50F;
        }
        if (str.equals("TwoK_50F")) {
            return TwoK_50F;
        }
        if (str.equals("FourK_50F")) {
            return FourK_50F;
        }
        if (str.equals("ExtremelyHigh_60F")) {
            return ExtremelyHigh_60F;
        }
        if (str.equals("TwoK_60F")) {
            return TwoK_60F;
        }
        if (str.equals("FourK_60F")) {
            return FourK_60F;
        }
        if (str.equals("ExtremelyHigh_120F")) {
            return ExtremelyHigh_120F;
        }
        if (str.equals("TwoK_120F")) {
            return TwoK_120F;
        }
        if (str.equals("FourK_120F")) {
            return FourK_120F;
        }
        if (str.equals("L_Standard_HDR")) {
            return L_Standard_HDR;
        }
        if (str.equals("Standard_HDR")) {
            return Standard_HDR;
        }
        if (str.equals("High_HDR")) {
            return High_HDR;
        }
        if (str.equals("H_High_HDR")) {
            return H_High_HDR;
        }
        if (str.equals("SuperHigh_HDR")) {
            return SuperHigh_HDR;
        }
        if (str.equals("ExtremelyHigh_HDR")) {
            return ExtremelyHigh_HDR;
        }
        if (str.equals("TwoK_HDR")) {
            return TwoK_HDR;
        }
        if (str.equals("FourK_HDR")) {
            return FourK_HDR;
        }
        return Undefine;
    }

    private EnumC86649v(String str, String str2) {
        this.f195302a = str;
        this.f195303b = str2;
    }
}

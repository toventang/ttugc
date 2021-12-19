package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: com.ss.android.vesdk.VEDebugSettings */
public class VEDebugSettings {
    public String mCaptureDir;
    public boolean mEnableImageDump;
    public String mImageDumpDir;
    public EnumC85215a mImageDumpType;
    public String mPreviewDir;

    /* renamed from: com.ss.android.vesdk.VEDebugSettings$1 */
    static /* synthetic */ class C852141 {
        static {
            Covode.recordClassIndex(99282);
        }
    }

    static {
        Covode.recordClassIndex(99281);
    }

    public String getCapDumpDir() {
        return this.mCaptureDir;
    }

    public boolean getEnableImageDump() {
        return this.mEnableImageDump;
    }

    public String getImageDumpDir() {
        return this.mImageDumpDir;
    }

    public EnumC85215a getImageDumpType() {
        return this.mImageDumpType;
    }

    public String getPrvDumpDir() {
        return this.mPreviewDir;
    }

    public int getImageDumpTypeValue() {
        return this.mImageDumpType.ordinal();
    }

    public boolean isNeedDumpCapture() {
        if (!this.mEnableImageDump) {
            return false;
        }
        if (this.mImageDumpType == EnumC85215a.BOTH || this.mImageDumpType == EnumC85215a.CAPTURE) {
            return true;
        }
        return false;
    }

    public boolean isNeedDumpPreview() {
        if (!this.mEnableImageDump) {
            return false;
        }
        if (this.mImageDumpType == EnumC85215a.BOTH || this.mImageDumpType == EnumC85215a.PREVIEW) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.vesdk.VEDebugSettings$a */
    public enum EnumC85215a {
        CAPTURE,
        PREVIEW,
        BOTH;

        static {
            Covode.recordClassIndex(99283);
        }
    }

    private VEDebugSettings() {
        this.mImageDumpType = EnumC85215a.CAPTURE;
        this.mImageDumpDir = "sdcard/vemo";
        this.mCaptureDir = this.mImageDumpDir + File.separator + "capture";
        this.mPreviewDir = this.mImageDumpDir + File.separator + "preview";
    }

    public String toString() {
        return "DebugSettings{mEnableImageDump=" + this.mEnableImageDump + ", mImageDumpType=" + this.mImageDumpType + ", mImageDumpDir=" + this.mImageDumpDir + ", mCaptureDir=" + this.mCaptureDir + ", mPreviewDir=" + this.mPreviewDir + "}";
    }

    public void init() {
        if (this.mEnableImageDump) {
            File file = new File(this.mImageDumpDir);
            if (!file.exists() && !file.isDirectory()) {
                C85315al.m146637a("VEDebugSettings", "Dump directory is not exist, so do mkdir {" + this.mImageDumpDir + "}");
                file.mkdir();
            }
            if (isNeedDumpCapture()) {
                File file2 = new File(this.mCaptureDir);
                if (!file2.exists() && !file2.isDirectory()) {
                    C85315al.m146637a("VEDebugSettings", "Dump capture directory is not exist, so do mkdir {" + this.mCaptureDir + "}");
                    file2.mkdir();
                }
            }
            if (isNeedDumpPreview()) {
                File file3 = new File(this.mPreviewDir);
                if (!file3.exists() && !file3.isDirectory()) {
                    C85315al.m146637a("VEDebugSettings", "Dump preview directory is not exist, so do mkdir {" + this.mPreviewDir + "}");
                    file3.mkdir();
                }
            }
        }
    }

    /* synthetic */ VEDebugSettings(C852141 r1) {
        this();
    }
}

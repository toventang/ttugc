package dmt.p4542av.video;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: dmt.av.video.WatermarkResSetting */
public final class WatermarkResSetting {
    private final int height;
    @AbstractC27891c(mo46611a = "min_allow_disk_mb")
    private final int minAllowDiskMB;
    private final int width;

    static {
        Covode.recordClassIndex(104185);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getMinAllowDiskMB() {
        return this.minAllowDiskMB;
    }

    public final int getWidth() {
        return this.width;
    }

    public WatermarkResSetting(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.minAllowDiskMB = i3;
    }
}

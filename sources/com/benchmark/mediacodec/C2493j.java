package com.benchmark.mediacodec;

import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.bytedance.covode.number.Covode;
import java.io.IOException;

/* renamed from: com.benchmark.mediacodec.j */
public class C2493j {

    /* renamed from: a */
    public MediaMuxer f7539a;

    /* renamed from: b */
    public int f7540b;

    /* renamed from: c */
    public boolean f7541c;

    /* renamed from: d */
    public EnumC2494a f7542d = EnumC2494a.UNSET;

    /* renamed from: e */
    private String f7543e;

    /* renamed from: f */
    private AbstractC2484d f7544f;

    static {
        Covode.recordClassIndex(2849);
    }

    /* renamed from: a */
    public final void mo6904a() {
        if (this.f7542d == EnumC2494a.STARTED) {
            this.f7541c = true;
            MediaMuxer mediaMuxer = this.f7539a;
            if (mediaMuxer != null) {
                mediaMuxer.stop();
            }
            this.f7542d = EnumC2494a.STOPED;
        }
    }

    /* renamed from: b */
    public final void mo6905b() {
        if (this.f7542d != EnumC2494a.UNSET && this.f7542d != EnumC2494a.RELEASED) {
            if (!this.f7541c && this.f7542d != EnumC2494a.STOPED) {
                mo6904a();
            }
            MediaMuxer mediaMuxer = this.f7539a;
            if (mediaMuxer != null) {
                mediaMuxer.release();
                this.f7539a = null;
            }
            this.f7542d = EnumC2494a.UNSET;
        }
    }

    /* renamed from: com.benchmark.mediacodec.j$a */
    public enum EnumC2494a {
        UNSET,
        INITED,
        STARTED,
        STOPED,
        RELEASED;

        static {
            Covode.recordClassIndex(2850);
        }
    }

    /* renamed from: a */
    public final int mo6903a(MediaFormat mediaFormat) {
        if (this.f7542d != EnumC2494a.UNSET) {
            return C2490g.f7529n;
        }
        try {
            MediaMuxer mediaMuxer = new MediaMuxer(this.f7543e, 0);
            this.f7539a = mediaMuxer;
            this.f7540b = mediaMuxer.addTrack(mediaFormat);
            this.f7542d = EnumC2494a.INITED;
            return this.f7540b;
        } catch (IOException unused) {
            return C2490g.f7519d;
        }
    }

    public C2493j(String str, AbstractC2484d dVar) {
        this.f7543e = str;
        this.f7544f = dVar;
    }
}

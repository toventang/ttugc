package com.p2082ss.android.ugc.playerkit.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.playerkit.model.o */
public class C84216o implements Serializable {

    /* renamed from: a */
    private String f188116a;

    /* renamed from: b */
    private boolean f188117b;

    /* renamed from: c */
    private int f188118c;

    /* renamed from: d */
    private int f188119d = -1;

    /* renamed from: e */
    private long f188120e = -1;

    /* renamed from: f */
    private boolean f188121f;

    /* renamed from: g */
    private int f188122g;

    /* renamed from: h */
    private boolean f188123h;

    /* renamed from: i */
    private boolean f188124i;

    /* renamed from: j */
    private int f188125j;

    /* renamed from: k */
    private int f188126k;

    /* renamed from: l */
    private long f188127l = -1;

    static {
        Covode.recordClassIndex(98123);
    }

    public int getAccertSessionPrepareType() {
        return this.f188122g;
    }

    public int getEngineState() {
        return this.f188119d;
    }

    public int getHwDecErrReason() {
        return this.f188118c;
    }

    public String getId() {
        return this.f188116a;
    }

    public long getOnRenderTime() {
        return this.f188127l;
    }

    public int getPlayJavaThreadPriority() {
        return this.f188126k;
    }

    public int getPrerenderJavaThreadPriority() {
        return this.f188125j;
    }

    public boolean getRenderDisplayed() {
        return this.f188121f;
    }

    public long getTid() {
        return this.f188120e;
    }

    public boolean isBytevc1() {
        return this.f188117b;
    }

    public boolean isCodecTypeChanged() {
        return this.f188123h;
    }

    public boolean isTextureRender() {
        return this.f188124i;
    }

    public void setAccertSessionPrepareType(int i) {
        this.f188122g = i;
    }

    public void setBytevc1(boolean z) {
        this.f188117b = z;
    }

    public void setCodecTypeChanged(boolean z) {
        this.f188123h = z;
    }

    public void setEngineState(int i) {
        this.f188119d = i;
    }

    public void setHwDecErrReason(int i) {
        this.f188118c = i;
    }

    public void setId(String str) {
        this.f188116a = str;
    }

    public void setOnRenderTime(long j) {
        this.f188127l = j;
    }

    public void setPlayJavaThreadPriority(int i) {
        this.f188126k = i;
    }

    public void setPrerenderJavaThreadPriority(int i) {
        this.f188125j = i;
    }

    public void setRenderDisplayed(boolean z) {
        this.f188121f = z;
    }

    public void setTextureRender(boolean z) {
        this.f188124i = z;
    }

    public void setTid(long j) {
        this.f188120e = j;
    }

    public C84216o(String str, boolean z, boolean z2) {
        this.f188116a = str;
        this.f188117b = z;
        this.f188121f = z2;
    }
}

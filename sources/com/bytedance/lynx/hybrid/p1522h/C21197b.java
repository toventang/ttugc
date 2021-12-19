package com.bytedance.lynx.hybrid.p1522h;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1515a.EnumC21149c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.h.b */
public class C21197b implements Serializable {

    /* renamed from: a */
    private boolean f50284a;

    /* renamed from: b */
    private boolean f50285b;

    /* renamed from: c */
    private String f50286c = "";

    /* renamed from: d */
    private String f50287d = "";

    /* renamed from: e */
    private boolean f50288e;

    /* renamed from: f */
    private boolean f50289f;

    /* renamed from: g */
    private String f50290g = "default_lynx_group";

    /* renamed from: h */
    private String f50291h = "";

    /* renamed from: i */
    private int f50292i;

    /* renamed from: j */
    private int f50293j;

    /* renamed from: k */
    private String f50294k = "";

    /* renamed from: l */
    private int f50295l;

    /* renamed from: m */
    private int f50296m;

    /* renamed from: n */
    private boolean f50297n;

    /* renamed from: o */
    private boolean f50298o = true;

    /* renamed from: p */
    private String f50299p = "";

    /* renamed from: q */
    private int f50300q;

    /* renamed from: r */
    private boolean f50301r = true;

    /* renamed from: s */
    private boolean f50302s;

    /* renamed from: t */
    private int f50303t;

    /* renamed from: u */
    private int f50304u = -1;

    /* renamed from: v */
    private String f50305v = "";

    /* renamed from: w */
    private boolean f50306w;

    /* renamed from: x */
    private EnumC21149c f50307x;

    static {
        Covode.recordClassIndex(24813);
    }

    public final String getBundle() {
        return this.f50286c;
    }

    public final String getChannel() {
        return this.f50287d;
    }

    public final boolean getDisableBuiltin() {
        return this.f50284a;
    }

    public final boolean getDisableGecko() {
        return this.f50285b;
    }

    public final boolean getDisableSaveImage() {
        return this.f50302s;
    }

    public final boolean getEnableCanvas() {
        return this.f50288e;
    }

    public final EnumC21149c getEngineType() {
        return this.f50307x;
    }

    public final boolean getForceH5() {
        return this.f50289f;
    }

    public final String getGroup() {
        return this.f50290g;
    }

    public final int getIgnoreCachePolicy() {
        return this.f50303t;
    }

    public final String getInitData() {
        return this.f50291h;
    }

    public final int getLynxViewHeight() {
        return this.f50293j;
    }

    public final int getLynxViewWidth() {
        return this.f50292i;
    }

    public final boolean getNeedSecLink() {
        return this.f50306w;
    }

    public final String getPreloadFonts() {
        return this.f50294k;
    }

    public final int getPresetHeight() {
        return this.f50296m;
    }

    public final boolean getPresetSafePoint() {
        return this.f50297n;
    }

    public final int getPresetWidth() {
        return this.f50295l;
    }

    public final String getSUrl() {
        return this.f50299p;
    }

    public final String getSecLinkScene() {
        return this.f50305v;
    }

    public final boolean getShareGroup() {
        return this.f50298o;
    }

    public final int getThreadStrategy() {
        return this.f50300q;
    }

    public final boolean getUiRunningMode() {
        return this.f50301r;
    }

    public final int getUseTtnet() {
        return this.f50304u;
    }

    public final void setDisableBuiltin(boolean z) {
        this.f50284a = z;
    }

    public final void setDisableGecko(boolean z) {
        this.f50285b = z;
    }

    public final void setDisableSaveImage(boolean z) {
        this.f50302s = z;
    }

    public final void setEnableCanvas(boolean z) {
        this.f50288e = z;
    }

    public final void setForceH5(boolean z) {
        this.f50289f = z;
    }

    public final void setIgnoreCachePolicy(int i) {
        this.f50303t = i;
    }

    public final void setLynxViewHeight(int i) {
        this.f50293j = i;
    }

    public final void setLynxViewWidth(int i) {
        this.f50292i = i;
    }

    public final void setNeedSecLink(boolean z) {
        this.f50306w = z;
    }

    public final void setPresetHeight(int i) {
        this.f50296m = i;
    }

    public final void setPresetSafePoint(boolean z) {
        this.f50297n = z;
    }

    public final void setPresetWidth(int i) {
        this.f50295l = i;
    }

    public final void setShareGroup(boolean z) {
        this.f50298o = z;
    }

    public final void setThreadStrategy(int i) {
        this.f50300q = i;
    }

    public final void setUiRunningMode(boolean z) {
        this.f50301r = z;
    }

    public final void setUseTtnet(int i) {
        this.f50304u = i;
    }

    public final void setBundle(String str) {
        C89219l.m154719c(str, "");
        this.f50286c = str;
    }

    public final void setChannel(String str) {
        C89219l.m154719c(str, "");
        this.f50287d = str;
    }

    public final void setEngineType(EnumC21149c cVar) {
        C89219l.m154719c(cVar, "");
        this.f50307x = cVar;
    }

    public final void setGroup(String str) {
        C89219l.m154719c(str, "");
        this.f50290g = str;
    }

    public final void setInitData(String str) {
        C89219l.m154719c(str, "");
        this.f50291h = str;
    }

    public final void setPreloadFonts(String str) {
        C89219l.m154719c(str, "");
        this.f50294k = str;
    }

    public final void setSUrl(String str) {
        C89219l.m154719c(str, "");
        this.f50299p = str;
    }

    public final void setSecLinkScene(String str) {
        C89219l.m154719c(str, "");
        this.f50305v = str;
    }

    public C21197b(EnumC21149c cVar) {
        C89219l.m154719c(cVar, "");
        this.f50307x = cVar;
    }
}

package com.bytedance.bridge.magpie.p883b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bridge.magpie.b.a */
public final class C13428a {

    /* renamed from: l */
    public static final C13429a f32731l = new C13429a((byte) 0);

    /* renamed from: a */
    public String f32732a = "";

    /* renamed from: b */
    public String f32733b = "";

    /* renamed from: c */
    public String f32734c = "";

    /* renamed from: d */
    public String f32735d = "";

    /* renamed from: e */
    public String f32736e = "";

    /* renamed from: f */
    public int f32737f;

    /* renamed from: g */
    public String f32738g = "";

    /* renamed from: h */
    public String f32739h = "";

    /* renamed from: i */
    public int f32740i;

    /* renamed from: j */
    public long f32741j = System.currentTimeMillis();

    /* renamed from: k */
    public EnumC13430b f32742k = EnumC13430b.DEFAULT;

    /* renamed from: com.bytedance.bridge.magpie.b.a$b */
    public enum EnumC13430b {
        LYNX,
        WEB,
        DEFAULT;

        static {
            Covode.recordClassIndex(15430);
        }
    }

    static {
        Covode.recordClassIndex(15428);
    }

    /* renamed from: com.bytedance.bridge.magpie.b.a$a */
    public static final class C13429a {
        static {
            Covode.recordClassIndex(15429);
        }

        private C13429a() {
        }

        public /* synthetic */ C13429a(byte b) {
            this();
        }
    }

    public final String toString() {
        return "BridgeCall(callbackId='" + this.f32732a + "', bridgeName='" + this.f32733b + "', url='" + this.f32734c + "', msgType='" + this.f32735d + "', params='" + this.f32736e + "', sdkVersion=" + this.f32737f + ", nameSpace='" + this.f32738g + "', frameUrl='" + this.f32739h + "', threadModel=" + this.f32740i + ')';
    }

    /* renamed from: a */
    public final void mo21648a(EnumC13430b bVar) {
        C89219l.m154719c(bVar, "");
        this.f32742k = bVar;
    }

    /* renamed from: b */
    public final void mo21650b(String str) {
        C89219l.m154719c(str, "");
        this.f32733b = str;
    }

    /* renamed from: c */
    public final void mo21651c(String str) {
        C89219l.m154719c(str, "");
        this.f32736e = str;
    }

    /* renamed from: a */
    public final void mo21649a(String str) {
        C89219l.m154719c(str, "");
        this.f32732a = str;
    }
}

package com.p2082ss.android.ugc.aweme.tools.mvtemplate;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.g */
public final class C78962g implements AbstractC81914b {

    /* renamed from: a */
    public final EnumC78964b f177471a;

    /* renamed from: b */
    public final EnumC78963a f177472b;

    /* renamed from: c */
    public final int f177473c;

    /* renamed from: d */
    public final float f177474d;

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.g$a */
    public enum EnumC78963a {
        MAIN_TEMPLATE,
        ICON_LIST;

        static {
            Covode.recordClassIndex(92112);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.g$b */
    public enum EnumC78964b {
        START,
        SCROLL;

        static {
            Covode.recordClassIndex(92113);
        }
    }

    static {
        Covode.recordClassIndex(92111);
    }

    public C78962g(EnumC78964b bVar, EnumC78963a aVar, byte b) {
        this(bVar, aVar);
    }

    public /* synthetic */ C78962g(EnumC78964b bVar, EnumC78963a aVar) {
        this(bVar, aVar, 0, 0.0f);
    }

    public C78962g(EnumC78964b bVar, EnumC78963a aVar, int i, float f) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        this.f177471a = bVar;
        this.f177472b = aVar;
        this.f177473c = i;
        this.f177474d = f;
    }
}

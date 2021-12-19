package com.p2082ss.android.p2123b;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;

/* renamed from: com.ss.android.b.c */
public enum EnumC29737c {
    JOURNEY_SLOGAN_ID(101),
    JOURNEY_INTERESTS_ID(102),
    JOURNEY_CONTENT_LANGUAGE_ID(104),
    JOURNEY_APP_LANGUAGE_ID(105),
    JOURNEY_SWIPE_UP_ID(106),
    JOURNEY_PRIVATE_ACCOUNT_TIPS_ID(107),
    JOURNEY_AD_EXPERIENCE_ID(108),
    JOURNEY_DEEPLINK_ID(109),
    JOURNEY_ON_UPDATE_ADD_FB_FRIENDS_ID(110),
    JOURNEY_NEW_USER_ADD_FB_FRIENDS_ID(111),
    JOURNEY_GENDER_SELECTION(112);
    
    public static final C29738a Companion = new C29738a((byte) 0);
    public static final Map<Integer, EnumC29737c> map;

    /* renamed from: b */
    private final int f70926b;

    /* renamed from: com.ss.android.b.c$a */
    public static final class C29738a {
        static {
            Covode.recordClassIndex(36139);
        }

        private C29738a() {
        }

        public /* synthetic */ C29738a(byte b) {
            this();
        }

        /* renamed from: a */
        public static EnumC29737c m59912a(int i) {
            return EnumC29737c.map.get(Integer.valueOf(i));
        }
    }

    public final int getId() {
        return this.f70926b;
    }

    static {
        EnumC29737c cVar;
        EnumC29737c cVar2;
        EnumC29737c cVar3;
        EnumC29737c cVar4;
        EnumC29737c cVar5;
        EnumC29737c cVar6;
        EnumC29737c cVar7;
        EnumC29737c cVar8;
        EnumC29737c cVar9;
        EnumC29737c cVar10;
        EnumC29737c cVar11;
        Covode.recordClassIndex(36138);
        map = C89041ag.m154421a(new C89378p(Integer.valueOf(cVar.f70926b), cVar), new C89378p(Integer.valueOf(cVar2.f70926b), cVar2), new C89378p(Integer.valueOf(cVar3.f70926b), cVar3), new C89378p(Integer.valueOf(cVar4.f70926b), cVar4), new C89378p(Integer.valueOf(cVar5.f70926b), cVar5), new C89378p(Integer.valueOf(cVar6.f70926b), cVar6), new C89378p(Integer.valueOf(cVar7.f70926b), cVar7), new C89378p(Integer.valueOf(cVar8.f70926b), cVar8), new C89378p(Integer.valueOf(cVar9.f70926b), cVar9), new C89378p(Integer.valueOf(cVar10.f70926b), cVar10), new C89378p(Integer.valueOf(cVar11.f70926b), cVar11));
    }

    private EnumC29737c(int i) {
        this.f70926b = i;
    }
}

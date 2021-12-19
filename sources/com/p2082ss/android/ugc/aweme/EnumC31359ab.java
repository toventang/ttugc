package com.p2082ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.liveevent.C58804f;
import com.p2082ss.android.ugc.aweme.p2362b.AbstractC34403c;
import com.p2082ss.android.ugc.aweme.p2362b.C34401a;
import com.p2082ss.android.ugc.aweme.p2362b.C34402b;
import com.p2082ss.android.ugc.aweme.p2382bb.AbstractC34773c;
import com.p2082ss.android.ugc.aweme.p2382bb.C34771a;
import com.p2082ss.android.ugc.aweme.p2382bb.C34774d;
import com.p2082ss.android.ugc.aweme.p2382bb.C34775e;
import com.p2082ss.android.ugc.aweme.p2403br.AbstractC34915b;
import com.p2082ss.android.ugc.aweme.p2403br.C34914a;
import p4600h.p4611f.p4613b.C89214g;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: com.ss.android.ugc.aweme.ab */
public class EnumC31359ab extends Enum<EnumC31359ab> {
    public static final EnumC31359ab ANCHOR_RESSO;
    public static final EnumC31359ab ANCHOR_RESSO_EXCLUSIVE;
    public static final EnumC31359ab ANCHOR_SHOP_LINK;
    public static final EnumC31359ab ANCHOR_SHOP_MIX;
    public static final EnumC31359ab ANCHOR_SHOP_WINDOW;
    public static final EnumC31359ab ARTICLE;
    public static final EnumC31359ab COMMON_TYPE;
    public static final EnumC31359ab DONATION_STICKER;
    public static final EnumC31359ab DUET;
    public static final EnumC31359ab INDIA_MOVIE;
    public static final EnumC31359ab LIVE_EVENT;
    public static final EnumC31359ab MIXED_VIDEO;
    public static final EnumC31359ab NEWS;
    public static final EnumC31359ab NO_TYPE;
    public static final EnumC31359ab OPEN_PLATFORM_ANCHOR;
    public static final EnumC31359ab PHOTO_MV_ANCHOR;
    public static final EnumC31359ab POI;
    public static final EnumC31359ab PROP;
    public static final EnumC31359ab QUIZLET;
    public static final EnumC31359ab SHOP;
    public static final EnumC31359ab SHOUTOUT;
    public static final EnumC31359ab TIKTOK_GAME;
    public static final EnumC31359ab TRIP_ADVISOR;
    public static final EnumC31359ab TTCM;

    /* renamed from: UG */
    public static final EnumC31359ab f75138UG;
    public static final EnumC31359ab VIA_MAKER;
    public static final EnumC31359ab WIKIHOW;
    public static final EnumC31359ab WIKIPEDIA;
    public static final EnumC31359ab YELP;

    /* renamed from: a */
    private static final /* synthetic */ EnumC31359ab[] f75139a;

    /* renamed from: b */
    private int f75140b;

    public static EnumC31359ab valueOf(String str) {
        return (EnumC31359ab) Enum.valueOf(EnumC31359ab.class, str);
    }

    public static EnumC31359ab[] values() {
        return (EnumC31359ab[]) f75139a.clone();
    }

    public final int getTYPE() {
        return this.f75140b;
    }

    /* renamed from: com.ss.android.ugc.aweme.ab$a */
    static final class C31360a extends EnumC31359ab {
        static {
            Covode.recordClassIndex(38062);
        }

        @Override // com.p2082ss.android.ugc.aweme.EnumC31359ab
        public final AbstractC34773c anchorInfo() {
            return new C34775e();
        }

        @Override // com.p2082ss.android.ugc.aweme.EnumC31359ab
        public final AbstractC34403c adapterFactory(AbstractC34884bl blVar) {
            return new C34402b(blVar);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31360a(String str) {
            super(str, 28, -100, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ab$b */
    static final class C31361b extends EnumC31359ab {
        static {
            Covode.recordClassIndex(38063);
        }

        @Override // com.p2082ss.android.ugc.aweme.EnumC31359ab
        public final AbstractC34773c anchorInfo() {
            return new C34774d();
        }

        @Override // com.p2082ss.android.ugc.aweme.EnumC31359ab
        public final AbstractC34403c adapterFactory(AbstractC34884bl blVar) {
            return new C34402b(blVar);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31361b(String str) {
            super(str, 11, 18, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ab$c */
    static final class C31362c extends EnumC31359ab {
        static {
            Covode.recordClassIndex(38064);
        }

        @Override // com.p2082ss.android.ugc.aweme.EnumC31359ab
        public final AbstractC34773c anchorInfo() {
            return new C34775e();
        }

        @Override // com.p2082ss.android.ugc.aweme.EnumC31359ab
        public final AbstractC34403c adapterFactory(AbstractC34884bl blVar) {
            return new C58804f(blVar);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31362c(String str) {
            super(str, 25, 41, null);
        }
    }

    public AbstractC34773c anchorInfo() {
        return new C34771a();
    }

    public AbstractC34915b anchorMob() {
        return new C34914a();
    }

    static {
        Covode.recordClassIndex(38061);
        EnumC31359ab abVar = new EnumC31359ab("NO_TYPE", 0, -1);
        NO_TYPE = abVar;
        EnumC31359ab abVar2 = new EnumC31359ab("WIKIPEDIA", 1, 0);
        WIKIPEDIA = abVar2;
        EnumC31359ab abVar3 = new EnumC31359ab("WIKIHOW", 2, 1);
        WIKIHOW = abVar3;
        EnumC31359ab abVar4 = new EnumC31359ab("SHOP", 3, 3);
        SHOP = abVar4;
        EnumC31359ab abVar5 = new EnumC31359ab("ARTICLE", 4, 5);
        ARTICLE = abVar5;
        EnumC31359ab abVar6 = new EnumC31359ab("ANCHOR_SHOP_LINK", 5, 6);
        ANCHOR_SHOP_LINK = abVar6;
        EnumC31359ab abVar7 = new EnumC31359ab("YELP", 6, 8);
        YELP = abVar7;
        EnumC31359ab abVar8 = new EnumC31359ab("TRIP_ADVISOR", 7, 9);
        TRIP_ADVISOR = abVar8;
        EnumC31359ab abVar9 = new EnumC31359ab("UG", 8, 12);
        f75138UG = abVar9;
        EnumC31359ab abVar10 = new EnumC31359ab("OPEN_PLATFORM_ANCHOR", 9, 15);
        OPEN_PLATFORM_ANCHOR = abVar10;
        EnumC31359ab abVar11 = new EnumC31359ab("MIXED_VIDEO", 10, 16);
        MIXED_VIDEO = abVar11;
        C31361b bVar = new C31361b("INDIA_MOVIE");
        INDIA_MOVIE = bVar;
        EnumC31359ab abVar12 = new EnumC31359ab("DONATION_STICKER", 12, 19);
        DONATION_STICKER = abVar12;
        EnumC31359ab abVar13 = new EnumC31359ab("ANCHOR_RESSO", 13, 23);
        ANCHOR_RESSO = abVar13;
        EnumC31359ab abVar14 = new EnumC31359ab("TIKTOK_GAME", 14, 24);
        TIKTOK_GAME = abVar14;
        EnumC31359ab abVar15 = new EnumC31359ab("VIA_MAKER", 15, 26);
        VIA_MAKER = abVar15;
        EnumC31359ab abVar16 = new EnumC31359ab("ANCHOR_RESSO_EXCLUSIVE", 16, 27);
        ANCHOR_RESSO_EXCLUSIVE = abVar16;
        EnumC31359ab abVar17 = new EnumC31359ab("PROP", 17, 28);
        PROP = abVar17;
        EnumC31359ab abVar18 = new EnumC31359ab("PHOTO_MV_ANCHOR", 18, 31);
        PHOTO_MV_ANCHOR = abVar18;
        EnumC31359ab abVar19 = new EnumC31359ab("NEWS", 19, 32);
        NEWS = abVar19;
        EnumC31359ab abVar20 = new EnumC31359ab("ANCHOR_SHOP_WINDOW", 20, 33);
        ANCHOR_SHOP_WINDOW = abVar20;
        EnumC31359ab abVar21 = new EnumC31359ab("ANCHOR_SHOP_MIX", 21, 35);
        ANCHOR_SHOP_MIX = abVar21;
        EnumC31359ab abVar22 = new EnumC31359ab("QUIZLET", 22, 36);
        QUIZLET = abVar22;
        EnumC31359ab abVar23 = new EnumC31359ab("DUET", 23, 37);
        DUET = abVar23;
        EnumC31359ab abVar24 = new EnumC31359ab("SHOUTOUT", 24, 40);
        SHOUTOUT = abVar24;
        C31362c cVar = new C31362c("LIVE_EVENT");
        LIVE_EVENT = cVar;
        EnumC31359ab abVar25 = new EnumC31359ab("POI", 26, 45);
        POI = abVar25;
        EnumC31359ab abVar26 = new EnumC31359ab("TTCM", 27, 46);
        TTCM = abVar26;
        C31360a aVar = new C31360a("COMMON_TYPE");
        COMMON_TYPE = aVar;
        f75139a = new EnumC31359ab[]{abVar, abVar2, abVar3, abVar4, abVar5, abVar6, abVar7, abVar8, abVar9, abVar10, abVar11, bVar, abVar12, abVar13, abVar14, abVar15, abVar16, abVar17, abVar18, abVar19, abVar20, abVar21, abVar22, abVar23, abVar24, cVar, abVar25, abVar26, aVar};
    }

    public final void setTYPE(int i) {
        this.f75140b = i;
    }

    public AbstractC34403c adapterFactory(AbstractC34884bl blVar) {
        return new C34401a(blVar);
    }

    private EnumC31359ab(String str, int i, int i2) {
        this.f75140b = i2;
    }

    public /* synthetic */ EnumC31359ab(String str, int i, int i2, C89214g gVar) {
        this(str, i, i2);
    }
}

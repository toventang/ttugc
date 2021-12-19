package com.p2082ss.android.ugc.aweme.shortvideo.p3853q;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.q.b */
public abstract class AbstractC72705b {

    /* renamed from: a */
    public final EnumC72711d f162998a;

    /* renamed from: b */
    public final String f162999b;

    /* renamed from: c */
    public final String f163000c;

    /* renamed from: d */
    public final String f163001d;

    /* renamed from: e */
    public final boolean f163002e;

    static {
        Covode.recordClassIndex(85388);
    }

    public /* synthetic */ AbstractC72705b(EnumC72711d dVar, String str, String str2, String str3) {
        this(dVar, str, str2, str3, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.q.b$a */
    public static class C72706a extends AbstractC72705b {

        /* renamed from: f */
        public final List<String> f163003f;

        static {
            Covode.recordClassIndex(85389);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72706a(List<String> list, EnumC72711d dVar, String str, String str2, String str3) {
            super(dVar, str, str2, str3);
            C89219l.m154721d(list, "");
            C89219l.m154721d(dVar, "");
            this.f163003f = list;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.q.b$b */
    public static final class C72707b extends C72706a {

        /* renamed from: g */
        public final boolean f163004g = true;

        static {
            Covode.recordClassIndex(85390);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72707b(List<String> list, EnumC72711d dVar, String str, String str2, String str3) {
            super(list, dVar, str, str2, str3);
            C89219l.m154721d(list, "");
            C89219l.m154721d(dVar, "");
        }
    }

    private AbstractC72705b(EnumC72711d dVar, String str, String str2, String str3, boolean z) {
        this.f162998a = dVar;
        this.f162999b = str;
        this.f163000c = str2;
        this.f163001d = str3;
        this.f163002e = z;
    }

    public /* synthetic */ AbstractC72705b(EnumC72711d dVar, String str, String str2, String str3, boolean z, byte b) {
        this(dVar, str, str2, str3, z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.q.b$d */
    public static final class C72709d extends AbstractC72705b {

        /* renamed from: f */
        public final String f163007f;

        /* renamed from: g */
        public long f163008g;

        /* renamed from: h */
        public long f163009h;

        static {
            Covode.recordClassIndex(85392);
        }

        public /* synthetic */ C72709d(String str, long j, EnumC72711d dVar, String str2, String str3, boolean z) {
            this(str, j, dVar, "", str2, str3, z);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C72709d(String str, long j, EnumC72711d dVar, String str2, String str3, String str4, boolean z) {
            super(dVar, str2, str3, str4, z, (byte) 0);
            C89219l.m154721d(str, "");
            C89219l.m154721d(dVar, "");
            this.f163007f = str;
            this.f163008g = 0;
            this.f163009h = j;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.q.b$c */
    public static final class C72708c extends AbstractC72705b {

        /* renamed from: f */
        public final ExtractFramesModel f163005f;

        /* renamed from: g */
        public final long f163006g;

        static {
            Covode.recordClassIndex(85391);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72708c(ExtractFramesModel extractFramesModel, long j, EnumC72711d dVar, String str, String str2, String str3, boolean z) {
            super(dVar, str, str2, str3, z, (byte) 0);
            C89219l.m154721d(dVar, "");
            this.f163005f = extractFramesModel;
            this.f163006g = j;
        }
    }
}

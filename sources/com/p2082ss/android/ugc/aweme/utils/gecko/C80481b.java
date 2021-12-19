package com.p2082ss.android.ugc.aweme.utils.gecko;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.gecko.b */
public final class C80481b {

    /* renamed from: a */
    public static final C80481b f180069a = new C80481b();

    /* renamed from: b */
    private static final AbstractC89244h f180070b = C89250i.m154774a(EnumC89331m.NONE, C80482a.f180071a);

    /* renamed from: a */
    public static Keva m139508a() {
        return (Keva) f180070b.getValue();
    }

    private C80481b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.gecko.b$a */
    static final class C80482a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C80482a f180071a = new C80482a();

        static {
            Covode.recordClassIndex(93755);
        }

        C80482a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepoSync("repo_gecko_channel_list", 0);
        }
    }

    static {
        Covode.recordClassIndex(93754);
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.gecko.b$b */
    public static final class C80483b extends AbstractC89220m implements AbstractC89172b<List<? extends String>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SharedPreferences.Editor f180072a;

        static {
            Covode.recordClassIndex(93756);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80483b(SharedPreferences.Editor editor) {
            super(1);
            this.f180072a = editor;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends String> list) {
            List<? extends String> list2 = list;
            C89219l.m154721d(list2, "");
            SharePrefCache inst = SharePrefCache.inst();
            C89219l.m154716b(inst, "");
            inst.getGeckoInitialHighPriorityChannels().mo59939b(this.f180072a, new HashSet(list2));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.gecko.b$c */
    public static final class C80484c extends AbstractC89220m implements AbstractC89172b<String[], C89391z> {

        /* renamed from: a */
        public static final C80484c f180073a = new C80484c();

        static {
            Covode.recordClassIndex(93757);
        }

        C80484c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String[] strArr) {
            String[] strArr2 = strArr;
            C89219l.m154721d(strArr2, "");
            C80481b.m139508a().storeStringArray("high_pri_channels", strArr2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.gecko.b$d */
    public static final class C80485d extends AbstractC89220m implements AbstractC89172b<List<? extends String>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SharedPreferences.Editor f180074a;

        static {
            Covode.recordClassIndex(93758);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80485d(SharedPreferences.Editor editor) {
            super(1);
            this.f180074a = editor;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends String> list) {
            List<? extends String> list2 = list;
            C89219l.m154721d(list2, "");
            SharePrefCache inst = SharePrefCache.inst();
            C89219l.m154716b(inst, "");
            inst.getGeckoChannels().mo59939b(this.f180074a, new HashSet(list2));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.gecko.b$e */
    public static final class C80486e extends AbstractC89220m implements AbstractC89172b<String[], C89391z> {

        /* renamed from: a */
        public static final C80486e f180075a = new C80486e();

        static {
            Covode.recordClassIndex(93759);
        }

        C80486e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String[] strArr) {
            String[] strArr2 = strArr;
            C89219l.m154721d(strArr2, "");
            C80481b.m139508a().storeStringArray("normal_channels", strArr2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m139509a(List<String> list, AbstractC89172b<? super List<String>, C89391z> bVar, AbstractC89172b<? super String[], C89391z> bVar2) {
        if (list == null) {
            list = new ArrayList<>();
        }
        bVar.invoke(list);
        if (C16048b.m29633a().mo25421a(true, "gecko_channel_store", false) && (list instanceof ArrayList)) {
            Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.String> /* = java.util.ArrayList<kotlin.String> */");
            ArrayList arrayList = (ArrayList) list;
            if (arrayList != null) {
                Object array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                bVar2.invoke(array);
            }
        }
    }
}

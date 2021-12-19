package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.a */
public abstract class EnumC54977a extends Enum<EnumC54977a> {
    public static final EnumC54977a ChatSession;
    public static final EnumC54977a StrangerSession;

    /* renamed from: a */
    private static final /* synthetic */ EnumC54977a[] f125860a;

    static {
        Covode.recordClassIndex(64703);
        C54978a aVar = new C54978a("ChatSession");
        ChatSession = aVar;
        C54983b bVar = new C54983b("StrangerSession");
        StrangerSession = bVar;
        f125860a = new EnumC54977a[]{aVar, bVar};
    }

    public static EnumC54977a valueOf(String str) {
        return (EnumC54977a) Enum.valueOf(EnumC54977a.class, str);
    }

    public static EnumC54977a[] values() {
        return (EnumC54977a[]) f125860a.clone();
    }

    public abstract List<AbstractC89187q<Context, AbstractC17427b, AbstractC56237a, AbstractC54985b>> getActionList();

    public abstract String getTitle(Context context, String str);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.a$a */
    static final class C54978a extends EnumC54977a {

        /* renamed from: a */
        private final List<AbstractC89187q<Context, AbstractC17427b, AbstractC56237a, AbstractC54985b>> f125861a;

        static {
            Covode.recordClassIndex(64704);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.EnumC54977a
        public final List<AbstractC89187q<Context, AbstractC17427b, AbstractC56237a, AbstractC54985b>> getActionList() {
            return this.f125861a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54978a(String str) {
            super(str, 0, null);
            ArrayList arrayList = new ArrayList();
            arrayList.add(C54979a.f125862a);
            arrayList.add(C54980b.f125863a);
            arrayList.add(C54981c.f125864a);
            arrayList.add(C54982d.f125865a);
            this.f125861a = C89070n.m154590j(arrayList);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.EnumC54977a
        public final String getTitle(Context context, String str) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(str, "");
            String string = context.getString(R.string.b8x, str);
            C89219l.m154716b(string, "");
            return string;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.a$a$a */
        static final class C54979a extends AbstractC89220m implements AbstractC89187q<Context, AbstractC17427b, AbstractC56237a, AbstractC54985b> {

            /* renamed from: a */
            public static final C54979a f125862a = new C54979a();

            static {
                Covode.recordClassIndex(64705);
            }

            C54979a() {
                super(3);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89187q
            public final /* synthetic */ AbstractC54985b invoke(Context context, AbstractC17427b bVar, AbstractC56237a aVar) {
                Context context2 = context;
                AbstractC17427b bVar2 = bVar;
                AbstractC56237a aVar2 = aVar;
                C89219l.m154721d(context2, "");
                C89219l.m154721d(bVar2, "");
                C89219l.m154721d(aVar2, "");
                return new C54988c(context2, bVar2, aVar2);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.a$a$b */
        static final class C54980b extends AbstractC89220m implements AbstractC89187q<Context, AbstractC17427b, AbstractC56237a, AbstractC54985b> {

            /* renamed from: a */
            public static final C54980b f125863a = new C54980b();

            static {
                Covode.recordClassIndex(64706);
            }

            C54980b() {
                super(3);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89187q
            public final /* synthetic */ AbstractC54985b invoke(Context context, AbstractC17427b bVar, AbstractC56237a aVar) {
                Context context2 = context;
                AbstractC17427b bVar2 = bVar;
                AbstractC56237a aVar2 = aVar;
                C89219l.m154721d(context2, "");
                C89219l.m154721d(bVar2, "");
                C89219l.m154721d(aVar2, "");
                return new C54999g(context2, bVar2, aVar2);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.a$a$c */
        static final class C54981c extends AbstractC89220m implements AbstractC89187q<Context, AbstractC17427b, AbstractC56237a, AbstractC54985b> {

            /* renamed from: a */
            public static final C54981c f125864a = new C54981c();

            static {
                Covode.recordClassIndex(64707);
            }

            C54981c() {
                super(3);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89187q
            public final /* synthetic */ AbstractC54985b invoke(Context context, AbstractC17427b bVar, AbstractC56237a aVar) {
                Context context2 = context;
                AbstractC17427b bVar2 = bVar;
                AbstractC56237a aVar2 = aVar;
                C89219l.m154721d(context2, "");
                C89219l.m154721d(bVar2, "");
                C89219l.m154721d(aVar2, "");
                return new C54995e(context2, bVar2, aVar2);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.a$a$d */
        static final class C54982d extends AbstractC89220m implements AbstractC89187q<Context, AbstractC17427b, AbstractC56237a, AbstractC54985b> {

            /* renamed from: a */
            public static final C54982d f125865a = new C54982d();

            static {
                Covode.recordClassIndex(64708);
            }

            C54982d() {
                super(3);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89187q
            public final /* synthetic */ AbstractC54985b invoke(Context context, AbstractC17427b bVar, AbstractC56237a aVar) {
                Context context2 = context;
                AbstractC17427b bVar2 = bVar;
                AbstractC56237a aVar2 = aVar;
                C89219l.m154721d(context2, "");
                C89219l.m154721d(bVar2, "");
                C89219l.m154721d(aVar2, "");
                return new C54997f(context2, bVar2, aVar2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.a$b */
    static final class C54983b extends EnumC54977a {

        /* renamed from: a */
        private final List<AbstractC89187q<Context, AbstractC17427b, AbstractC56237a, AbstractC54985b>> f125866a;

        static {
            Covode.recordClassIndex(64709);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.EnumC54977a
        public final List<AbstractC89187q<Context, AbstractC17427b, AbstractC56237a, AbstractC54985b>> getActionList() {
            return this.f125866a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54983b(String str) {
            super(str, 1, null);
            ArrayList arrayList = new ArrayList();
            arrayList.add(C54984a.f125867a);
            this.f125866a = C89070n.m154590j(arrayList);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.EnumC54977a
        public final String getTitle(Context context, String str) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(str, "");
            String string = context.getString(R.string.b92, str);
            C89219l.m154716b(string, "");
            return string;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.a$b$a */
        static final class C54984a extends AbstractC89220m implements AbstractC89187q<Context, AbstractC17427b, AbstractC56237a, AbstractC54985b> {

            /* renamed from: a */
            public static final C54984a f125867a = new C54984a();

            static {
                Covode.recordClassIndex(64710);
            }

            C54984a() {
                super(3);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89187q
            public final /* synthetic */ AbstractC54985b invoke(Context context, AbstractC17427b bVar, AbstractC56237a aVar) {
                Context context2 = context;
                AbstractC17427b bVar2 = bVar;
                AbstractC56237a aVar2 = aVar;
                C89219l.m154721d(context2, "");
                C89219l.m154721d(bVar2, "");
                C89219l.m154721d(aVar2, "");
                return new C54988c(context2, bVar2, aVar2);
            }
        }
    }

    private EnumC54977a(String str, int i) {
    }

    public /* synthetic */ EnumC54977a(String str, int i, C89214g gVar) {
        this(str, i);
    }
}

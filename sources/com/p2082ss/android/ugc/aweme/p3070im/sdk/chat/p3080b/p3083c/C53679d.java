package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.CommentContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.CommentStatus;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.CommentStatusResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55231t;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55262b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.TikTokImApi;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.d */
public final class C53679d {

    /* renamed from: a */
    public static final C53679d f123181a = new C53679d();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.d$a */
    public static final class C53680a extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f123182a;

        /* renamed from: b */
        int f123183b;

        /* renamed from: c */
        final /* synthetic */ C53679d f123184c;

        /* renamed from: d */
        Object f123185d;

        static {
            Covode.recordClassIndex(63260);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53680a(C53679d dVar, AbstractC89124d dVar2) {
            super(dVar2);
            this.f123184c = dVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f123182a = obj;
            this.f123183b |= Integer.MIN_VALUE;
            return this.f123184c.mo90229a(null, this);
        }
    }

    private C53679d() {
    }

    static {
        Covode.recordClassIndex(63259);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.d$b */
    public static final class CallableC53681b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ List f123186a;

        static {
            Covode.recordClassIndex(63261);
        }

        public CallableC53681b(List list) {
            this.f123186a = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            List list = this.f123186a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((C19538ai) obj).getMsgType() == 40) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (!arrayList2.isEmpty()) {
                return arrayList2;
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.d$c */
    public static final class C53682c<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C53682c f123187a = new C53682c();

        static {
            Covode.recordClassIndex(63262);
        }

        C53682c() {
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.d$c$a */
        static final class C53683a extends AbstractC89220m implements AbstractC89172b<C19538ai, CharSequence> {

            /* renamed from: a */
            public static final C53683a f123188a = new C53683a();

            static {
                Covode.recordClassIndex(63263);
            }

            C53683a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ CharSequence invoke(C19538ai aiVar) {
                C19538ai aiVar2 = aiVar;
                C89219l.m154721d(aiVar2, "");
                BaseContent b = EnumC53772b.C53814f.m99071b(aiVar2);
                Objects.requireNonNull(b, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent");
                String commentId = ((CommentContent) b).getCommentId();
                C89219l.m154716b(commentId, "");
                return commentId;
            }
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            C89219l.m154721d(list, "");
            return new C89378p(list, C89070n.m154551a(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C53683a.f123188a, 30));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.d$d */
    public static final class C53684d<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C53684d f123189a = new C53684d();

        static {
            Covode.recordClassIndex(63264);
        }

        C53684d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            final C89378p pVar = (C89378p) obj;
            C89219l.m154721d(pVar, "");
            String str = (String) pVar.getSecond();
            C89219l.m154721d(str, "");
            return ((TikTokImApi) C55262b.f126362a.getValue()).getCommentStatusBatch(str).mo143248c(new AbstractC88434g() {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53679d.C53684d.C536851 */

                static {
                    Covode.recordClassIndex(63265);
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ Object apply(Object obj) {
                    T t;
                    boolean z;
                    String str;
                    String str2;
                    CommentStatusResponse commentStatusResponse = (CommentStatusResponse) obj;
                    C89219l.m154721d(commentStatusResponse, "");
                    List list = (List) pVar.getFirst();
                    List<CommentStatus> commentStatus = commentStatusResponse != null ? commentStatusResponse.getCommentStatus() : null;
                    ArrayList arrayList = new ArrayList();
                    if (list != null) {
                        for (T t2 : list) {
                            BaseContent b = EnumC53772b.C53814f.m99071b(t2);
                            Objects.requireNonNull(b, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent");
                            CommentContent commentContent = (CommentContent) b;
                            if (commentStatus != null) {
                                Iterator<T> it = commentStatus.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        t = null;
                                        break;
                                    }
                                    t = it.next();
                                    T t3 = t;
                                    if (C89219l.m154714a((Object) String.valueOf(t3 != null ? t3.getCommentId() : null), (Object) commentContent.getCommentId())) {
                                        break;
                                    }
                                }
                                T t4 = t;
                                if (t4 != null) {
                                    String valueOf = String.valueOf(t4.getSharingStatus());
                                    String reason = t4.getReason();
                                    if (reason == null) {
                                        C89219l.m154715b();
                                    }
                                    if (valueOf == null || valueOf.length() == 0 || !((str2 = t2.getLocalExt().get("access_status")) == null || str2.length() == 0 || (!C89219l.m154714a((Object) valueOf, (Object) t2.getLocalExt().get("access_status"))))) {
                                        z = false;
                                    } else {
                                        t2.addLocalExt("access_status", valueOf);
                                        z = true;
                                    }
                                    if (reason != null && reason.length() != 0 && ((str = t2.getLocalExt().get("reason_string")) == null || str.length() == 0 || (!C89219l.m154714a((Object) reason, (Object) t2.getLocalExt().get("reason_string"))))) {
                                        t2.addLocalExt("reason_string", reason);
                                    } else if (!z) {
                                    }
                                    C55231t.m100999a((C19538ai) t2);
                                    arrayList.add(t2);
                                }
                            }
                            C56244a.m102193e("CommentStateManager", "Comment " + commentContent.getCommentId() + " remote status request failed!");
                        }
                    }
                    return arrayList;
                }
            });
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo90229a(com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.CommentContent r9, p4600h.p4603c.AbstractC89124d<? super com.p2082ss.android.ugc.aweme.feed.model.Aweme> r10) {
        /*
        // Method dump skipped, instructions count: 269
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53679d.mo90229a(com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent, h.c.d):java.lang.Object");
    }
}

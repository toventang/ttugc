package com.p2082ss.android.ugc.aweme.deeplink.actions.p2732a;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.deeplink.C41059q;
import com.p2082ss.android.ugc.aweme.deeplink.p2735d.C41039c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import kotlinx.coroutines.AbstractC89507ah;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import p4600h.C89378p;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.deeplink.actions.a.b */
public abstract class AbstractC41008b<T> extends AbstractC41006a {
    public static final C41009a Companion = new C41009a((byte) 0);
    private Context context;
    public T customResult;
    private String enterFrom = "";
    public HashMap<String, Object> globalParams;
    private boolean isFromNotification;
    public Uri originalUri;
    public Uri terminalPrefixUri;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.deeplink.actions.a.b$c */
    public static final class C41012c extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f95895a;

        /* renamed from: b */
        int f95896b;

        /* renamed from: c */
        final /* synthetic */ AbstractC41008b f95897c;

        static {
            Covode.recordClassIndex(48882);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41012c(AbstractC41008b bVar, AbstractC89124d dVar) {
            super(dVar);
            this.f95897c = bVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f95895a = obj;
            this.f95896b |= Integer.MIN_VALUE;
            return this.f95897c.preRunBlock(this);
        }
    }

    static {
        Covode.recordClassIndex(48878);
    }

    /* renamed from: com_ss_android_ugc_aweme_deeplink_actions_base_BaseLinkAction_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m82627x6a51587f(String str, String str2) {
        return 0;
    }

    public abstract C89378p<String, HashMap<String, Object>> buildInnerUrl(String str, HashMap<String, Object> hashMap);

    public ArrayList<Integer> getFlags() {
        return null;
    }

    public final boolean isAsyncAction() {
        return false;
    }

    public final boolean needIntercept() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.deeplink.actions.a.b$a */
    public static final class C41009a {
        static {
            Covode.recordClassIndex(48879);
        }

        private C41009a() {
        }

        public /* synthetic */ C41009a(byte b) {
            this();
        }
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final T getResult() {
        return this.customResult;
    }

    public final boolean isFromNotification() {
        return this.isFromNotification;
    }

    public final HashMap<String, Object> getGlobalParams() {
        HashMap<String, Object> hashMap = this.globalParams;
        if (hashMap == null) {
            C89219l.m154710a("globalParams");
        }
        return hashMap;
    }

    public final Uri getOriginalUri() {
        Uri uri = this.originalUri;
        if (uri == null) {
            C89219l.m154710a("originalUri");
        }
        return uri;
    }

    public final Uri getTerminalPrefixUri() {
        Uri uri = this.terminalPrefixUri;
        if (uri == null) {
            C89219l.m154710a("terminalPrefixUri");
        }
        return uri;
    }

    public String getTargetPageName() {
        Uri uri = this.terminalPrefixUri;
        if (uri == null) {
            C89219l.m154710a("terminalPrefixUri");
        }
        String host = uri.getHost();
        if (host == null) {
            return "homepage_hot";
        }
        return host;
    }

    public final void setFromNotification(boolean z) {
        this.isFromNotification = z;
    }

    public final void setEnterFrom(String str) {
        C89219l.m154721d(str, "");
        this.enterFrom = str;
    }

    public final void setGlobalParams(HashMap<String, Object> hashMap) {
        C89219l.m154721d(hashMap, "");
        this.globalParams = hashMap;
    }

    public final void setOriginalUri(Uri uri) {
        C89219l.m154721d(uri, "");
        this.originalUri = uri;
    }

    public final void setTerminalPrefixUri(Uri uri) {
        C89219l.m154721d(uri, "");
        this.terminalPrefixUri = uri;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.deeplink.actions.a.b$d */
    public static final class C41013d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d, Object> {

        /* renamed from: a */
        int f95898a;

        /* renamed from: b */
        final /* synthetic */ AbstractC41008b f95899b;

        static {
            Covode.recordClassIndex(48883);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41013d(AbstractC41008b bVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f95899b = bVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C41013d(this.f95899b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d dVar) {
            return ((C41013d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f95898a == 0) {
                C89382r.m154942a(obj);
                this.f95899b.getActionName();
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void parseParams(HashMap<String, Object> hashMap) {
        if (hashMap.containsKey("is_from_notification")) {
            Object obj = hashMap.get("is_from_notification");
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            this.isFromNotification = ((Boolean) obj).booleanValue();
        }
        if (hashMap.containsKey("enter_from")) {
            Object obj2 = hashMap.get("enter_from");
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
            this.enterFrom = (String) obj2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.deeplink.actions.a.b$b */
    public static final class C41010b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f95888a;

        /* renamed from: b */
        int f95889b;

        /* renamed from: c */
        final /* synthetic */ String f95890c;

        /* renamed from: d */
        final /* synthetic */ AbstractC41008b f95891d;

        /* renamed from: e */
        final /* synthetic */ Context f95892e;

        static {
            Covode.recordClassIndex(48880);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41010b(String str, AbstractC89124d dVar, AbstractC41008b bVar, Context context) {
            super(2, dVar);
            this.f95890c = str;
            this.f95891d = bVar;
            this.f95892e = context;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C41010b(this.f95890c, dVar, this.f95891d, this.f95892e);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C41010b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            AbstractC41008b bVar;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f95889b;
            if (i == 0) {
                C89382r.m154942a(obj);
                bVar = this.f95891d;
                AbstractC89507ah ahVar = C89546bf.f203267b;
                C410111 r1 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super T>, Object>(this, null) {
                    /* class com.p2082ss.android.ugc.aweme.deeplink.actions.p2732a.AbstractC41008b.C41010b.C410111 */

                    /* renamed from: a */
                    int f95893a;

                    /* renamed from: b */
                    final /* synthetic */ C41010b f95894b;

                    static {
                        Covode.recordClassIndex(48881);
                    }

                    {
                        this.f95894b = r2;
                    }

                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                        C89219l.m154721d(dVar, "");
                        return 

                        /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
                        /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object preRunBlock(p4600h.p4603c.AbstractC89124d<? super T> r7) {
                            /*
                                r6 = this;
                                boolean r0 = r7 instanceof com.p2082ss.android.ugc.aweme.deeplink.actions.p2732a.AbstractC41008b.C41012c
                                if (r0 == 0) goto L_0x0036
                                r5 = r7
                                com.ss.android.ugc.aweme.deeplink.actions.a.b$c r5 = (com.p2082ss.android.ugc.aweme.deeplink.actions.p2732a.AbstractC41008b.C41012c) r5
                                int r0 = r5.f95896b
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r1
                                if (r0 == 0) goto L_0x0036
                                int r0 = r5.f95896b
                                int r0 = r0 - r1
                                r5.f95896b = r0
                            L_0x0013:
                                java.lang.Object r1 = r5.f95895a
                                h.c.a.a r4 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
                                int r0 = r5.f95896b
                                r3 = 0
                                r2 = 1
                                if (r0 == 0) goto L_0x0023
                                if (r0 != r2) goto L_0x003c
                                p4600h.C89382r.m154942a(r1)
                            L_0x0022:
                                return r3
                            L_0x0023:
                                p4600h.C89382r.m154942a(r1)
                                kotlinx.coroutines.ah r1 = kotlinx.coroutines.C89546bf.f203266a
                                com.ss.android.ugc.aweme.deeplink.actions.a.b$d r0 = new com.ss.android.ugc.aweme.deeplink.actions.a.b$d
                                r0.<init>(r6, r3)
                                r5.f95896b = r2
                                java.lang.Object r0 = kotlinx.coroutines.C89624i.m155554a(r1, r0, r5)
                                if (r0 != r4) goto L_0x0022
                                return r4
                            L_0x0036:
                                com.ss.android.ugc.aweme.deeplink.actions.a.b$c r5 = new com.ss.android.ugc.aweme.deeplink.actions.a.b$c
                                r5.<init>(r6, r7)
                                goto L_0x0013
                            L_0x003c:
                                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r0)
                                throw r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.deeplink.actions.p2732a.AbstractC41008b.preRunBlock(h.c.d):java.lang.Object");
                        }

                        private final void handleOpen(String str, Context context2) {
                            if (!needIntercept()) {
                                onActionPreHandleFinish();
                                Uri parse = Uri.parse(str);
                                C89219l.m154716b(parse, "");
                                C89378p<String, HashMap<String, Object>> buildInnerUrl = buildInnerUrl(str, C41059q.C41060a.m82715a(parse.getQuery()));
                                String first = buildInnerUrl.getFirst();
                                HashMap<String, Object> second = buildInnerUrl.getSecond();
                                HashMap<String, Object> hashMap = this.globalParams;
                                if (hashMap == null) {
                                    C89219l.m154710a("globalParams");
                                }
                                second.putAll(hashMap);
                                m82627x6a51587f("UG-deeplink-refactor", "BaseLinkAction finalUrl = ".concat(String.valueOf(first + "?" + C41059q.C41060a.m82714a(second))));
                                Uri parse2 = Uri.parse(first);
                                C89219l.m154716b(parse2, "");
                                this.terminalPrefixUri = parse2;
                                C41039c.m82672b("TerminalNode");
                                if (doRealOpen(context2, first, second, getFlags())) {
                                    Uri uri = this.originalUri;
                                    if (uri == null) {
                                        C89219l.m154710a("originalUri");
                                    }
                                    C41039c.m82668a("Transfer", LiveNetAdaptiveHurryTimeSetting.DEFAULT, uri, "");
                                    return;
                                }
                                Uri uri2 = this.originalUri;
                                if (uri2 == null) {
                                    C89219l.m154710a("originalUri");
                                }
                                C41039c.m82668a("Transfer", 3002, uri2, "action match but jump fail");
                                return;
                            }
                            m82627x6a51587f("UG-deeplink-refactor", getActionName() + "was intercepted");
                            onActionPreHandleFinish();
                            onActionIntercept();
                            C41039c.m82672b("TerminalNode");
                            Uri uri3 = this.originalUri;
                            if (uri3 == null) {
                                C89219l.m154710a("originalUri");
                            }
                            C41039c.m82668a("Transfer", LiveNetAdaptiveHurryTimeSetting.DEFAULT, uri3, "");
                        }

                        public final void handleOpenWithAsyncResult(String str, Context context2, T t) {
                            handleOpen(str, context2);
                        }

                        public final void open(Context context2, String str, HashMap<String, Object> hashMap) {
                            C89219l.m154721d(context2, "");
                            C89219l.m154721d(hashMap, "");
                            m82627x6a51587f("UG-deeplink-refactor", "BaseLinkAction call open");
                            onActionStart();
                            this.context = context2;
                            this.globalParams = hashMap;
                            Uri parse = Uri.parse(str);
                            C89219l.m154716b(parse, "");
                            this.originalUri = parse;
                            if (parse == null) {
                                C89219l.m154710a("originalUri");
                            }
                            this.terminalPrefixUri = parse;
                            parseParams(hashMap);
                            if (str != null) {
                                if (isAsyncAction()) {
                                    AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89652o.f203399a), null, null, new C41010b(str, null, this, context2), 3);
                                } else {
                                    handleOpen(str, context2);
                                }
                            }
                            if (this.context instanceof Activity) {
                                m82627x6a51587f("UG-deeplink-refactor", "BaseLinkAction call activity.finish()");
                                Context context3 = this.context;
                                Objects.requireNonNull(context3, "null cannot be cast to non-null type android.app.Activity");
                                ((Activity) context3).finish();
                            }
                        }
                    }

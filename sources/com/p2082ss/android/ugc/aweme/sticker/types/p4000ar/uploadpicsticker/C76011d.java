package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.C59183a;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.sticker.EffectSdkExtra;
import com.p2082ss.android.ugc.aweme.sticker.p3953c.AbstractC75274a;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4002b.C75998a;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76020d;
import com.p2082ss.android.ugc.tools.utils.C84891c;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d */
public final class C76011d {

    /* renamed from: i */
    public static final C76012a f170786i = new C76012a((byte) 0);

    /* renamed from: a */
    final HandlerThread f170787a;

    /* renamed from: b */
    public Handler f170788b;

    /* renamed from: c */
    public AbstractC76020d f170789c;

    /* renamed from: d */
    public String f170790d;

    /* renamed from: e */
    String f170791e;

    /* renamed from: f */
    public final AbstractC89188r<String, String, String, Integer, C89391z> f170792f = new C76016e(this);

    /* renamed from: g */
    public final AbstractC75274a f170793g;

    /* renamed from: h */
    public final Context f170794h;

    /* renamed from: j */
    private Handler f170795j;

    /* renamed from: k */
    private final AbstractC89188r<String, String, String, Boolean, C89391z> f170796k = new C76015d(this);

    static {
        Covode.recordClassIndex(88955);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d$a */
    public static final class C76012a {
        static {
            Covode.recordClassIndex(88956);
        }

        private C76012a() {
        }

        public /* synthetic */ C76012a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo119712a() {
        AbstractC76020d dVar = this.f170789c;
        if (dVar != null) {
            dVar.mo119677a();
        }
    }

    /* renamed from: c */
    public final void mo119715c() {
        this.f170793g.mo59559b();
    }

    /* renamed from: b */
    public final void mo119714b() {
        Handler handler = this.f170795j;
        if (handler == null) {
            C89219l.m154710a("workHandler");
        }
        handler.sendEmptyMessage(1001);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d$c */
    public static final class HandlerC76014c extends Handler {

        /* renamed from: a */
        final /* synthetic */ C76011d f170798a;

        static {
            Covode.recordClassIndex(88958);
        }

        public final void handleMessage(Message message) {
            C89219l.m154721d(message, "");
            int i = message.what;
            if (i == 1001) {
                ArrayList arrayList = new ArrayList();
                if (message.obj != null) {
                    Object obj = message.obj;
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                    arrayList = (ArrayList) obj;
                }
                AbstractC76020d dVar = this.f170798a.f170789c;
                if (dVar != null) {
                    dVar.mo119679a(arrayList);
                }
            } else if (i == 1002) {
                Object obj2 = message.obj;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.data.UploadPicData");
                C75998a aVar = (C75998a) obj2;
                String str = this.f170798a.f170790d;
                if (str != null && C89219l.m154714a((Object) str, (Object) aVar.f170745f)) {
                    C76011d dVar2 = this.f170798a;
                    AbstractC76020d dVar3 = dVar2.f170789c;
                    if (dVar3 != null) {
                        dVar3.mo119678a(aVar);
                    }
                    if (!TextUtils.isEmpty(aVar.f170741b) && C89219l.m154714a((Object) aVar.f170741b, (Object) dVar2.f170791e)) {
                        dVar2.mo119712a();
                    }
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        HandlerC76014c(C76011d dVar, Looper looper) {
            super(looper);
            this.f170798a = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d$b */
    public static final class HandlerC76013b extends Handler {

        /* renamed from: a */
        final /* synthetic */ C76011d f170797a;

        static {
            Covode.recordClassIndex(88957);
        }

        public final void handleMessage(Message message) {
            boolean z;
            Bundle data;
            ArrayList<String> stringArrayList;
            String str;
            C89219l.m154721d(message, "");
            int i = message.what;
            if (i == 1001) {
                Message obtain = Message.obtain();
                Context context = this.f170797a.f170794h;
                C89219l.m154721d(context, "");
                ArrayList arrayList = new ArrayList();
                List<MediaModel> a = C59183a.m108683a(context, false, 100, 0);
                if (C84904k.m145909a(a)) {
                    arrayList = null;
                } else {
                    for (MediaModel mediaModel : a) {
                        if (C84902i.m145892a(mediaModel.f134662b) && C84896h.m145862a(mediaModel)) {
                            int i2 = mediaModel.f134672l;
                            int i3 = mediaModel.f134673m;
                            if (i2 <= 0 || i3 <= 0) {
                                int[] a2 = C84891c.m145849a(mediaModel.f134662b);
                                i2 = a2[0];
                                i3 = a2[1];
                            }
                            float f = (float) i2;
                            float f2 = (float) i3;
                            if (f > f2 * 2.5f || f2 > f * 2.5f) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (i2 >= 360 && i3 >= 480 && !z) {
                                arrayList.add(mediaModel.f134662b);
                            }
                        }
                    }
                }
                obtain.obj = arrayList;
                obtain.what = 1001;
                Handler handler = this.f170797a.f170788b;
                if (handler != null) {
                    handler.sendMessage(obtain);
                }
            } else if (i == 1004 && (stringArrayList = (data = message.getData()).getStringArrayList("img_list")) != null) {
                C89219l.m154716b(stringArrayList, "");
                EffectSdkExtra effectSdkExtra = (EffectSdkExtra) data.getParcelable("effect_sdk_extra");
                if (effectSdkExtra != null) {
                    C89219l.m154716b(effectSdkExtra, "");
                    if (!(stringArrayList.isEmpty() || effectSdkExtra.getPl().getAlg().isEmpty() || (str = this.f170797a.f170790d) == null)) {
                        this.f170797a.f170793g.mo59558a(str, stringArrayList, effectSdkExtra, this.f170797a.f170792f);
                    }
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        HandlerC76013b(C76011d dVar, Looper looper) {
            super(looper);
            this.f170797a = dVar;
        }
    }

    public C76011d(AbstractC75274a aVar, Context context) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(context, "");
        this.f170793g = aVar;
        this.f170794h = context;
        HandlerThread handlerThread = new HandlerThread("pixaloop_work");
        this.f170787a = handlerThread;
        handlerThread.start();
        this.f170795j = new HandlerC76013b(this, handlerThread.getLooper());
        this.f170788b = new HandlerC76014c(this, Looper.getMainLooper());
    }

    /* renamed from: a */
    public final void mo119713a(List<String> list, C75998a aVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(aVar, "");
        if (list.isEmpty() || aVar.mo119702b().isEmpty()) {
            mo119712a();
            return;
        }
        this.f170791e = null;
        Handler handler = this.f170788b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f170795j;
        if (handler2 == null) {
            C89219l.m154710a("workHandler");
        }
        handler2.removeCallbacksAndMessages(null);
        this.f170791e = (String) C89070n.m154586h((List) list);
        this.f170790d = aVar.f170745f;
        Message obtain = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("img_list", (ArrayList) list);
        bundle.putParcelable("effect_sdk_extra", aVar.f170746g);
        C89219l.m154716b(obtain, "");
        obtain.setData(bundle);
        obtain.what = 1004;
        Handler handler3 = this.f170795j;
        if (handler3 == null) {
            C89219l.m154710a("workHandler");
        }
        handler3.sendMessage(obtain);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d$d */
    static final class C76015d extends AbstractC89220m implements AbstractC89188r<String, String, String, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76011d f170799a;

        static {
            Covode.recordClassIndex(88959);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76015d(C76011d dVar) {
            super(4);
            this.f170799a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8774a(String str, String str2, String str3, Boolean bool) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(str4, "");
            C89219l.m154721d(str5, "");
            C89219l.m154721d(str6, "");
            Message obtain = Message.obtain();
            C75998a aVar = new C75998a(str5, str6, booleanValue);
            aVar.f170745f = str4;
            obtain.obj = aVar;
            obtain.what = 1002;
            Handler handler = this.f170799a.f170788b;
            if (handler != null) {
                handler.sendMessage(obtain);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d$e */
    static final class C76016e extends AbstractC89220m implements AbstractC89188r<String, String, String, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76011d f170800a;

        static {
            Covode.recordClassIndex(88960);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76016e(C76011d dVar) {
            super(4);
            this.f170800a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8774a(String str, String str2, String str3, Integer num) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            int intValue = num.intValue();
            C89219l.m154721d(str4, "");
            C89219l.m154721d(str5, "");
            C89219l.m154721d(str6, "");
            Message obtain = Message.obtain();
            C75998a aVar = new C75998a(str5, str6, intValue);
            aVar.f170745f = str4;
            obtain.obj = aVar;
            obtain.what = 1002;
            Handler handler = this.f170800a.f170788b;
            if (handler != null) {
                handler.sendMessage(obtain);
            }
            return C89391z.f203057a;
        }
    }
}

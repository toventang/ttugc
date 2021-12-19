package com.p2082ss.android.ugc.aweme.commercialize.feed;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38164aj;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38202w;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.io.Serializable;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.av */
public final class C37866av implements WeakHandler.IHandler {

    /* renamed from: a */
    static final WeakHandler f89366a;

    /* renamed from: b */
    static RunnableC37867a f89367b;

    /* renamed from: c */
    public static final C37866av f89368c;

    private C37866av() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.av$a */
    public static final class RunnableC37867a implements Runnable {

        /* renamed from: a */
        private final Aweme f89369a;

        /* renamed from: b */
        private final String f89370b;

        static {
            Covode.recordClassIndex(45319);
        }

        public final void run() {
            C38189j.m77482a(C17867d.m33078a(), this.f89369a, this.f89370b);
        }

        public RunnableC37867a(Aweme aweme, String str) {
            this.f89369a = aweme;
            this.f89370b = str;
        }
    }

    /* renamed from: a */
    public static final void m76518a() {
        RunnableC37867a aVar = f89367b;
        if (aVar != null) {
            aVar.run();
        }
        f89367b = null;
    }

    static {
        Covode.recordClassIndex(45318);
        C37866av avVar = new C37866av();
        f89368c = avVar;
        f89366a = new WeakHandler(avVar);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        Bundle data;
        if (message != null && message.what == 1048577 && (data = message.getData()) != null) {
            try {
                String string = data.getString("refer");
                Serializable serializable = data.getSerializable("aweme_raw_data");
                if (serializable != null) {
                    AwemeRawAd awemeRawAd = (AwemeRawAd) serializable;
                    Context a = C17867d.m33078a();
                    JSONObject a2 = C38189j.m77470a(a, awemeRawAd, true, (Map<String, String>) null);
                    if (string != null) {
                        try {
                            a2.put("refer", string);
                        } catch (JSONException unused) {
                        }
                    }
                    C38189j.m77490a(a, "click", awemeRawAd, a2);
                    if (awemeRawAd != null) {
                        C38164aj.m77369a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new C38202w(awemeRawAd));
                    }
                    message.setData(null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.AwemeRawAd");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static final void m76519a(Context context, Aweme aweme, String str) {
        Integer valueOf;
        int i;
        if (context != null && aweme != null && aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (!(awemeRawAd == null || (valueOf = Integer.valueOf(awemeRawAd.getLeftSlideClickType())) == null)) {
                if (valueOf.intValue() == 0) {
                    C38189j.m77482a(context, aweme, str);
                    return;
                } else if (valueOf.intValue() == 1) {
                    return;
                } else {
                    if (valueOf.intValue() == 2) {
                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                        if (awemeRawAd2 != null) {
                            i = awemeRawAd2.getLeftSlideClickDuration();
                        } else {
                            i = 0;
                        }
                        WeakHandler weakHandler = f89366a;
                        weakHandler.removeMessages(1048577);
                        try {
                            Message obtain = Message.obtain();
                            obtain.what = 1048577;
                            C89219l.m154716b(obtain, "");
                            Bundle bundle = new Bundle();
                            bundle.putString("refer", str);
                            bundle.putSerializable("aweme_raw_data", aweme.getAwemeRawAd());
                            obtain.setData(bundle);
                            weakHandler.sendMessageDelayed(obtain, ((long) i) * 1000);
                            return;
                        } catch (Throwable unused) {
                        }
                    } else if (valueOf.intValue() == 3) {
                        f89367b = new RunnableC37867a(aweme, str);
                        return;
                    }
                }
            }
            C38189j.m77482a(context, aweme, str);
        }
    }
}

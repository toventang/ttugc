package com.p2082ss.android.ugc.aweme.settingsrequest;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.settingsrequest.p3741d.C68792b;
import com.p2082ss.android.ugc.aweme.settingsrequest.p3741d.C68793c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.settingsrequest.PopupSettingManager */
public final class PopupSettingManager implements WeakHandler.IHandler {

    /* renamed from: a */
    static PopupSettingRequestApi f153811a;

    /* renamed from: b */
    private static final String f153812b;

    /* renamed from: c */
    private WeakHandler f153813c;

    /* renamed from: d */
    private Map<WeakHandler, Integer> f153814d;

    /* renamed from: e */
    private Map<String, C68793c> f153815e;

    /* renamed from: f */
    private volatile boolean f153816f;

    /* renamed from: com.ss.android.ugc.aweme.settingsrequest.PopupSettingManager$PopupSettingRequestApi */
    interface PopupSettingRequestApi {
        static {
            Covode.recordClassIndex(81034);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/user/popup/")
        AbstractFutureC27655q<C68792b> requestPopupConfig(@AbstractC89736t(mo144292a = "post_video_status") String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.settingsrequest.PopupSettingManager$a */
    public static class C68764a {

        /* renamed from: a */
        public static PopupSettingManager f153819a = new PopupSettingManager((byte) 0);

        static {
            Covode.recordClassIndex(81035);
        }
    }

    static {
        Covode.recordClassIndex(81032);
        String str = Api.f79771d;
        f153812b = str;
        f153811a = (PopupSettingRequestApi) C18097a.m33698a(str, PopupSettingRequestApi.class);
    }

    private PopupSettingManager() {
        this.f153814d = new ConcurrentHashMap();
        this.f153816f = false;
        this.f153813c = new WeakHandler(this);
        this.f153815e = new HashMap();
    }

    /* synthetic */ PopupSettingManager(byte b) {
        this();
    }

    /* renamed from: a */
    public final C68793c mo109243a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C68793c cVar = this.f153815e.get(str);
        this.f153815e.put(str, null);
        return cVar;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        List<C68793c> list;
        Object obj = message.obj;
        int i = message.what;
        this.f153816f = false;
        if (obj instanceof C34485a) {
            new C79459a(C17867d.m33078a()).mo123052a(((C34485a) obj).getErrorMsg()).mo123053a();
        } else if (obj instanceof Exception) {
            new C79459a(C17867d.m33078a()).mo123052a(C17867d.m33078a().getResources().getString(R.string.dcr)).mo123053a();
        } else if ((obj instanceof C68792b) && i == 1 && (list = ((C68792b) obj).f153850a) != null) {
            for (C68793c cVar : list) {
                if (cVar != null) {
                    try {
                        String str = cVar.f153855e;
                        if (!TextUtils.isEmpty(str)) {
                            this.f153815e.put(str, cVar);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            Iterator<Map.Entry<WeakHandler, Integer>> it = this.f153814d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<WeakHandler, Integer> next = it.next();
                next.getKey().sendEmptyMessage(next.getValue().intValue());
                it.remove();
            }
        }
    }

    /* renamed from: a */
    private void m121194a(WeakHandler weakHandler, final int i) {
        C34608n.m70658a().mo61083a(weakHandler, new Callable() {
            /* class com.p2082ss.android.ugc.aweme.settingsrequest.PopupSettingManager.CallableC687631 */

            static {
                Covode.recordClassIndex(81033);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                try {
                    PopupSettingRequestApi popupSettingRequestApi = PopupSettingManager.f153811a;
                    int i = i;
                    if (i == 0) {
                        str = "1";
                    } else if (i != 2) {
                        str = "2";
                    } else {
                        str = "3";
                    }
                    return popupSettingRequestApi.requestPopupConfig(str).get();
                } catch (ExecutionException e) {
                    throw AbstractC34479a.getCompatibleException(e);
                }
            }
        }, 1);
    }

    /* renamed from: a */
    public final void mo109244a(WeakHandler weakHandler, int i, int i2) {
        MethodCollector.m26663i(11750);
        this.f153814d.put(weakHandler, Integer.valueOf(i));
        synchronized (this) {
            try {
                if (!this.f153816f) {
                    this.f153816f = true;
                    m121194a(this.f153813c, i2);
                    MethodCollector.m26664o(11750);
                }
            } finally {
                MethodCollector.m26664o(11750);
            }
        }
    }
}

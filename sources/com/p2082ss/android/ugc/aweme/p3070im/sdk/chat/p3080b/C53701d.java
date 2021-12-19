package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.p025c.C0484a;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.tux.p1719f.p1720a.C23126b;
import com.bytedance.tux.p1722h.C23154c;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.GroupSystemContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SystemContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.top.p3130ui.ChatTopTip;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55052e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c.C55071i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.model.BlockResponse;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.d */
public final class C53701d {
    static {
        Covode.recordClassIndex(63281);
    }

    /* renamed from: a */
    private static boolean m98975a(int i) {
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8 || i == 9;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.d$a */
    public static class C53702a extends ClickableSpan implements WeakHandler.IHandler {

        /* renamed from: a */
        public SystemContent.Key f123218a;

        /* renamed from: b */
        boolean f123219b;

        /* renamed from: c */
        private WeakReference<ChatTopTip> f123220c;

        /* renamed from: d */
        private CharSequence f123221d;

        /* renamed from: e */
        private String f123222e;

        /* renamed from: f */
        private int f123223f;

        /* renamed from: g */
        private WeakHandler f123224g;

        static {
            Covode.recordClassIndex(63282);
        }

        /* renamed from: a */
        private void m98976a() {
            if (this.f123224g == null) {
                this.f123224g = new WeakHandler(Looper.getMainLooper(), this);
            }
        }

        /* renamed from: a */
        public final void mo90245a(ChatTopTip chatTopTip) {
            this.f123220c = new WeakReference<>(chatTopTip);
        }

        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f123223f);
            textPaint.setUnderlineText(false);
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
            if (message.what == 1) {
                m98977a(message.obj);
            } else if (message.what == 0) {
                m98977a(message.obj);
            }
        }

        /* renamed from: a */
        private static void m98977a(Object obj) {
            Context a = C17867d.m33078a();
            if (obj instanceof C34485a) {
                C13628n.m24508a(a, 0, ((C34485a) obj).getErrorMsg());
            } else if (obj instanceof Exception) {
                C13628n.m24506a(a, (int) R.string.cdr);
            } else if (obj instanceof BlockResponse) {
                BlockResponse blockResponse = (BlockResponse) obj;
                if (blockResponse.getBlockStaus() == 1) {
                    C13628n.m24506a(a, (int) R.string.cci);
                } else if (blockResponse.getBlockStaus() == 0) {
                    C13628n.m24506a(a, (int) R.string.ci9);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00b7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(final android.view.View r19) {
            /*
            // Method dump skipped, instructions count: 867
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.C53701d.C53702a.onClick(android.view.View):void");
        }

        /* renamed from: a */
        public final void mo90246a(String str, String str2) {
            this.f123221d = str;
            this.f123222e = str2;
        }

        private C53702a(int i, String str, String str2, boolean z) {
            this.f123223f = i;
            this.f123221d = str;
            if (str == null) {
                this.f123221d = "0";
            }
            this.f123222e = str2;
            if (str2 == null) {
                this.f123222e = "";
            }
            this.f123219b = z;
            m98976a();
        }

        /* synthetic */ C53702a(int i, String str, String str2, boolean z, byte b) {
            this(i, str, str2, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.d$b */
    public static class C53704b extends ClickableSpan {

        /* renamed from: a */
        private int f123228a;

        static {
            Covode.recordClassIndex(63284);
        }

        public C53704b(int i) {
            this.f123228a = i;
        }

        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(this.f123228a);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C55076b.m100723b().updateApk(C23154c.m43640a(view.getContext()));
            C39162r.m79461a("click_update_message", (JSONObject) null);
        }
    }

    /* renamed from: a */
    public static void m98973a(SystemContent systemContent) {
        if (systemContent != null && systemContent.getTemplate() != null && systemContent.getTemplate().length > 0) {
            SystemContent.Key key = systemContent.getTemplate()[0];
            if (SystemContent.LinkTypeExtra.isSafeWarningLink(key)) {
                C55059b.m100698d("show");
            }
            if ((key.getAction() == 3 || key.getAction() == 7) && key.getExtra() != null) {
                String str = key.getExtra().get("scene");
                C0484a aVar = new C0484a();
                aVar.put("notice_type", str);
                aVar.put("process_id", C55059b.f126008b);
                C39162r.m79460a(" show_chat_notice", aVar);
            }
        }
    }

    /* renamed from: a */
    public static C53702a m98971a(int i, String str, String str2, boolean z) {
        return new C53702a(i, str, str2, z, (byte) 0);
    }

    /* renamed from: a */
    public static void m98972a(C19538ai aiVar, SystemContent systemContent, TextView textView, String str, String str2) {
        m98974a(null, aiVar, systemContent, textView, str, str2, C0643b.m2378c(C17867d.m33078a(), R.color.ba), -16776961, false, -1, "", null);
    }

    /* renamed from: a */
    public static void m98974a(ChatTopTip chatTopTip, C19538ai aiVar, SystemContent systemContent, TextView textView, String str, String str2, int i, int i2, boolean z, int i3, String str3, C53709a aVar) {
        SystemContent.Key[] template;
        String tips;
        int indexOf;
        textView.setVisibility(8);
        if (systemContent instanceof GroupSystemContent) {
            textView.setText(((GroupSystemContent) systemContent).getNoticeText(true));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setOnLongClickListener(View$OnLongClickListenerC53705e.f123229a);
            textView.setHighlightColor(i2);
            textView.setVisibility(0);
            return;
        }
        if (TextUtils.isEmpty(systemContent.getNewTips()) || systemContent.getNewTemplate() == null || systemContent.getNewTemplate().length <= 0) {
            template = systemContent.getTemplate();
            tips = systemContent.getTips();
        } else {
            template = systemContent.getNewTemplate();
            tips = systemContent.getNewTips();
        }
        if (C55071i.m100715a(systemContent)) {
            C56244a.m102191c("MessageViewHelper", "setTips found illegal url in tip ".concat(String.valueOf(tips)));
        } else if (template != null && template.length > 0) {
            for (SystemContent.Key key : template) {
                if (key != null && !TextUtils.isEmpty(key.getKey()) && !TextUtils.isEmpty(key.getName())) {
                    if (m98975a(key.getAction())) {
                        tips = tips.replace(C1764a.m5928a("{{%s}}", new Object[]{key.getKey()}), key.getName());
                    } else if (!TextUtils.isEmpty(systemContent.getFallbackTips())) {
                        textView.setText(systemContent.getFallbackTips());
                        textView.setVisibility(0);
                        return;
                    } else {
                        return;
                    }
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tips);
            for (int i4 = 0; i4 < template.length; i4++) {
                SystemContent.Key key2 = template[i4];
                if (key2 != null && !TextUtils.isEmpty(key2.getKey()) && !TextUtils.isEmpty(key2.getName()) && (indexOf = tips.indexOf(template[i4].getName())) >= 0) {
                    C53702a a = m98971a(i, str, str2, z);
                    a.f123218a = key2;
                    a.mo90245a(chatTopTip);
                    spannableStringBuilder.setSpan(a, indexOf, indexOf + key2.getName().length(), 33);
                    if (z) {
                        spannableStringBuilder.setSpan(new C23126b(52, true), indexOf, key2.getName().length() + indexOf, 33);
                    }
                }
            }
            textView.setText(spannableStringBuilder);
            Bundle bundle = new Bundle();
            if (aiVar != null) {
                bundle.putSerializable("msg", aiVar);
            }
            if (C55052e.m100672c() && aVar != null) {
                bundle.putSerializable("notice_code", str3);
                bundle.putSerializable("notice_type", Integer.valueOf(i3));
                bundle.putSerializable("key_session_info", aVar);
            }
            textView.setTag(bundle);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setOnLongClickListener(View$OnLongClickListenerC53706f.f123230a);
            textView.setHighlightColor(i2);
            textView.setVisibility(0);
        } else if (TextUtils.isEmpty(tips)) {
            textView.setVisibility(8);
        } else {
            textView.setText(tips);
            textView.setVisibility(0);
        }
    }
}

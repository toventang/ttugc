package com.p2082ss.android.ugc.aweme.notification.p3518a;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.facebook.common.p1839k.C24134g;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.api.C61530a;
import com.p2082ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61627b;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.NotificationDetailVM;
import com.p2082ss.android.ugc.aweme.notification.utils.C62262g;
import com.p2082ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.SchemaPageHelperImpl;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.a.g */
public final class View$OnClickListenerC61768g extends AbstractView$OnLongClickListenerC62118k implements View.OnClickListener {

    /* renamed from: a */
    private final View f140160a;

    /* renamed from: b */
    private final AvatarImageView f140161b;

    /* renamed from: c */
    private final TextView f140162c;

    /* renamed from: d */
    private final RemoteImageView f140163d;

    /* renamed from: e */
    private BaseNotice f140164e;

    /* renamed from: f */
    private C61627b f140165f;

    /* renamed from: m */
    private Context f140166m;

    /* renamed from: n */
    private final NotificationDetailVM f140167n;

    static {
        Covode.recordClassIndex(72501);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k
    public final int ce_() {
        return R.id.cv7;
    }

    /* renamed from: c */
    private static boolean m111817c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: h */
    private final boolean m111818h() {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        BaseNotice baseNotice = this.f140164e;
        if (baseNotice == null || (str = baseNotice.nid) == null) {
            str = "";
        }
        hashMap.put("notice_id", str);
        hashMap.put("aid", String.valueOf(C61530a.C61531a.f139672a));
        hashMap.put("channel", SchemaPageHelperImpl.m138975b().mo99361a());
        SchemaPageHelper b = SchemaPageHelperImpl.m138975b();
        Context context = this.f140166m;
        C61627b bVar = this.f140165f;
        if (bVar != null) {
            str2 = bVar.f139876d;
        } else {
            str2 = null;
        }
        String string = this.f140166m.getString(R.string.ch_);
        if (string == null) {
            string = "";
        }
        C89219l.m154716b(string, "");
        return b.mo99363a(context, str2, string, hashMap);
    }

    /* renamed from: a */
    public final void mo99876a(BaseNotice baseNotice) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C89219l.m154721d(baseNotice, "");
        if (baseNotice.adHelperNotice != null) {
            this.f140164e = baseNotice;
            this.f140165f = baseNotice.adHelperNotice;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f140767g) {
                spannableStringBuilder.append((char) 8296);
            }
            C61627b bVar = this.f140165f;
            UrlModel urlModel = null;
            if (bVar != null) {
                str = bVar.f139874b;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                C61627b bVar2 = this.f140165f;
                if (bVar2 != null) {
                    str4 = bVar2.f139874b;
                } else {
                    str4 = null;
                }
                spannableStringBuilder.append((CharSequence) str4);
                C61627b bVar3 = this.f140165f;
                if (bVar3 != null) {
                    str5 = bVar3.f139873a;
                } else {
                    str5 = null;
                }
                if (!TextUtils.isEmpty(str5)) {
                    spannableStringBuilder.append(": ");
                }
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
            }
            C61627b bVar4 = this.f140165f;
            if (bVar4 != null) {
                str2 = bVar4.f139873a;
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                C61627b bVar5 = this.f140165f;
                if (bVar5 != null) {
                    str3 = bVar5.f139873a;
                } else {
                    str3 = null;
                }
                spannableStringBuilder.append((CharSequence) str3);
            }
            if (this.f140767g) {
                spannableStringBuilder.append((char) 8297);
            }
            this.f140161b.setImageURI(C24134g.m45734a(2131231293));
            mo100141a(spannableStringBuilder, baseNotice);
            this.f140162c.setText(spannableStringBuilder);
            RemoteImageView remoteImageView = this.f140163d;
            C61627b bVar6 = this.f140165f;
            if (bVar6 != null) {
                urlModel = bVar6.f139878f;
            }
            C34577e.m70592a(remoteImageView, urlModel);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void onClick(View view) {
        String str;
        ClickAgent.onClick(view);
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m111817c();
        }
        if (!C58029j.f132256h) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            new C23144b(view2).mo37640e(R.string.dcq).mo37637b();
        } else if (view != null) {
            int id = view.getId();
            String str2 = null;
            if (id == R.id.cv7 || id == R.id.cuf) {
                C36125t a = C36125t.m73591a();
                C61627b bVar = this.f140165f;
                if (bVar != null) {
                    str = bVar.f139879g;
                } else {
                    str = null;
                }
                if (!C36125t.m73598a(a, str) && !m111818h()) {
                    C36125t a2 = C36125t.m73591a();
                    C61627b bVar2 = this.f140165f;
                    if (bVar2 != null) {
                        str2 = bVar2.f139875c;
                    }
                    C36125t.m73598a(a2, str2);
                }
            } else if (id == R.id.bgn) {
                C36125t a3 = C36125t.m73591a();
                C61627b bVar3 = this.f140165f;
                if (bVar3 != null) {
                    str2 = bVar3.f139875c;
                }
                if (!C36125t.m73598a(a3, str2)) {
                    m111818h();
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC61768g(View view, NotificationDetailVM notificationDetailVM) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(notificationDetailVM, "");
        this.f140167n = notificationDetailVM;
        View findViewById = view.findViewById(R.id.cv7);
        C89219l.m154716b(findViewById, "");
        this.f140160a = findViewById;
        View findViewById2 = view.findViewById(R.id.cuf);
        C89219l.m154716b(findViewById2, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById2;
        this.f140161b = avatarImageView;
        View findViewById3 = view.findViewById(R.id.cu7);
        C89219l.m154716b(findViewById3, "");
        this.f140162c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bgn);
        C89219l.m154716b(findViewById4, "");
        RemoteImageView remoteImageView = (RemoteImageView) findViewById4;
        this.f140163d = remoteImageView;
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        this.f140166m = context;
        C62262g.m112634a(findViewById);
        C62023a.m112168a(remoteImageView);
        C62023a.m112168a(avatarImageView);
        remoteImageView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        avatarImageView.setOnClickListener(this);
        this.f140767g = C80471gb.m139483a(this.f140166m);
    }
}

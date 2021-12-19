package com.p2082ss.android.ugc.aweme.following.p3003ui.viewholder;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51107f;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationTitleViewHolder */
public final class RecommendRelationTitleViewHolder extends JediSimpleViewHolder<C51107f> implements AbstractC33974au {

    /* renamed from: f */
    public final View f118369f;

    /* renamed from: g */
    private final View f118370g;

    /* renamed from: j */
    private final TextView f118371j;

    static {
        Covode.recordClassIndex(60557);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecommendRelationTitleViewHolder(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = this.itemView.findViewById(R.id.amb);
        C89219l.m154716b(findViewById, "");
        this.f118370g = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.f8n);
        C89219l.m154716b(findViewById2, "");
        this.f118371j = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.d6k);
        C89219l.m154716b(findViewById3, "");
        this.f118369f = findViewById3;
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationTitleViewHolder$a */
    static final class View$OnClickListenerC51350a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendRelationTitleViewHolder f118372a;

        static {
            Covode.recordClassIndex(60558);
        }

        View$OnClickListenerC51350a(RecommendRelationTitleViewHolder recommendRelationTitleViewHolder) {
            this.f118372a = recommendRelationTitleViewHolder;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", "find_friends");
            C39162r.m79460a("click_privacy_tips", hashMap);
            SharePrefCache inst = SharePrefCache.inst();
            C89219l.m154716b(inst, "");
            C33594aj<String> privacyReminderH5Url = inst.getPrivacyReminderH5Url();
            C89219l.m154716b(privacyReminderH5Url, "");
            String c = privacyReminderH5Url.mo59941c();
            if (!TextUtils.isEmpty(c)) {
                Intent intent = new Intent(this.f118372a.f118369f.getContext(), CrossPlatformActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_load_dialog", true);
                intent.putExtra("hide_nav_bar", false);
                intent.putExtra("use_webview_title", true);
                intent.putExtras(bundle);
                intent.setData(Uri.parse(c));
                Context context = this.f118372a.f118369f.getContext();
                C84349a.m145093a(intent, context);
                context.startActivity(intent);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(C51107f fVar) {
        C51107f fVar2 = fVar;
        C89219l.m154721d(fVar2, "");
        this.f118371j.setText(fVar2.f117932b);
        this.f118370g.setVisibility(8);
        if (!C16048b.m29633a().mo25421a(true, "enable_privacy_reminder", false) || fVar2.f117931a != 4) {
            this.f118369f.setVisibility(8);
            return;
        }
        this.f118369f.setVisibility(0);
        this.f118370g.setVisibility(0);
        this.f118369f.setOnClickListener(new View$OnClickListenerC51350a(this));
    }
}

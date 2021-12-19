package com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4287a;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2730de.C40977l;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.aweme.widgetcompat.RemoteImageView;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.C82726a;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.C82745b;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.AbstractC82771b;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.C82776g;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.a.b */
public final class C82734b extends RecyclerView.ViewHolder {

    /* renamed from: a */
    RemoteImageView f184930a;

    /* renamed from: b */
    TextView f184931b;

    /* renamed from: c */
    TextView f184932c;

    /* renamed from: d */
    RemoteImageView f184933d;

    /* renamed from: e */
    public final C82745b f184934e;

    /* renamed from: f */
    public AbstractC82733a f184935f;

    static {
        Covode.recordClassIndex(96581);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.a.b$a */
    static final class View$OnClickListenerC82735a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C82734b f184936a;

        /* renamed from: b */
        final /* synthetic */ AbstractC82771b f184937b;

        static {
            Covode.recordClassIndex(96582);
        }

        View$OnClickListenerC82735a(C82734b bVar, AbstractC82771b bVar2) {
            this.f184936a = bVar;
            this.f184937b = bVar2;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (!C40977l.m82500a(view, 1200)) {
                this.f184936a.f184935f.mo127730b(this.f184937b);
                C82745b bVar = this.f184936a.f184934e;
                String str2 = null;
                if (bVar != null) {
                    str = bVar.getShootWay();
                } else {
                    str = null;
                }
                C82745b bVar2 = this.f184936a.f184934e;
                if (bVar2 != null) {
                    str2 = bVar2.getCreationId();
                }
                String name = this.f184937b.getName();
                JSONObject jSONObject = new JSONObject();
                C82726a.m142892a(jSONObject, new C82726a.C82729c(str, str2, name));
                C80322d.m139252a("enter_ngo_detail", jSONObject);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.a.b$b */
    static final class View$OnClickListenerC82736b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C82734b f184938a;

        /* renamed from: b */
        final /* synthetic */ AbstractC82771b f184939b;

        static {
            Covode.recordClassIndex(96583);
        }

        View$OnClickListenerC82736b(C82734b bVar, AbstractC82771b bVar2) {
            this.f184938a = bVar;
            this.f184939b = bVar2;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            ClickAgent.onClick(view);
            if (!C40977l.m82500a(view, 1200)) {
                this.f184938a.f184935f.mo127729a(this.f184939b);
                C82745b bVar = this.f184938a.f184934e;
                String str4 = null;
                if (bVar != null) {
                    str = bVar.getShootWay();
                } else {
                    str = null;
                }
                C82745b bVar2 = this.f184938a.f184934e;
                if (bVar2 != null) {
                    str2 = bVar2.getCreationId();
                } else {
                    str2 = null;
                }
                String name = this.f184939b.getName();
                int adapterPosition = this.f184938a.getAdapterPosition() + 1;
                C82745b bVar3 = this.f184938a.f184934e;
                if (bVar3 != null) {
                    str3 = bVar3.getContentSource();
                } else {
                    str3 = null;
                }
                C82745b bVar4 = this.f184938a.f184934e;
                if (bVar4 != null) {
                    str4 = bVar4.getContentType();
                }
                JSONObject jSONObject = new JSONObject();
                C82726a.m142892a(jSONObject, new C82726a.C82730d(str, str2, name, str3, str4, adapterPosition));
                C80322d.m139252a("add_donation_sticker", jSONObject);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82734b(View view, C82745b bVar, AbstractC82733a aVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        this.f184934e = bVar;
        this.f184935f = aVar;
        this.f184930a = (RemoteImageView) view.findViewById(R.id.by6);
        this.f184931b = (TextView) view.findViewById(R.id.f0m);
        this.f184932c = (TextView) view.findViewById(R.id.f0l);
        this.f184933d = (RemoteImageView) view.findViewById(R.id.by5);
    }

    /* renamed from: a */
    static Spannable m142895a(String str, Context context, List<C82776g> list) {
        SpannableString spannableString = new SpannableString(str);
        for (C82776g gVar : list) {
            if (!(gVar.getStartIndex() == null || gVar.getEndIndex() == null || context == null)) {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C0643b.m2378c(context, R.color.bh));
                Integer startIndex = gVar.getStartIndex();
                if (startIndex == null) {
                    C89219l.m154715b();
                }
                int intValue = startIndex.intValue();
                Integer endIndex = gVar.getEndIndex();
                if (endIndex == null) {
                    C89219l.m154715b();
                }
                spannableString.setSpan(foregroundColorSpan, intValue, endIndex.intValue(), 33);
            }
        }
        return spannableString;
    }
}

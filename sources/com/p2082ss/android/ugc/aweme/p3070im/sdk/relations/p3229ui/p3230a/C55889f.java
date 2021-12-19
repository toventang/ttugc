package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55161a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.C55879c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.a.f */
public final class C55889f extends C55879c {
    static {
        Covode.recordClassIndex(65679);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a, com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.C55879c
    public final /* synthetic */ AbstractC55867a.C55871b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m101691a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.a.f$a */
    public class C55890a extends AbstractC55867a.C55871b {

        /* renamed from: e */
        public AvatarImageView f127411e;

        /* renamed from: f */
        public RemoteImageView f127412f;

        /* renamed from: h */
        private TextView f127414h;

        /* renamed from: i */
        private TextView f127415i;

        /* renamed from: j */
        private TextView f127416j;

        /* renamed from: k */
        private TextView f127417k;

        /* renamed from: l */
        private TextView f127418l;

        /* renamed from: m */
        private ImageView f127419m;

        /* renamed from: n */
        private ImageView f127420n;

        /* renamed from: o */
        private TuxIconView f127421o;

        /* renamed from: p */
        private View f127422p;

        /* renamed from: q */
        private LinearLayout f127423q;

        static {
            Covode.recordClassIndex(65680);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a.C55871b, com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.C55289a
        /* renamed from: b */
        public final void mo92308b() {
            this.f127422p = this.itemView.findViewById(R.id.c93);
            this.f127423q = (LinearLayout) this.itemView.findViewById(R.id.ejf);
            this.f127416j = (TextView) this.itemView.findViewById(R.id.title_tv);
            this.f127420n = (ImageView) this.itemView.findViewById(R.id.bmp);
            this.f127418l = (TextView) this.itemView.findViewById(R.id.bmr);
            this.f127411e = (AvatarImageView) this.itemView.findViewById(R.id.on);
            this.f127419m = (ImageView) this.itemView.findViewById(R.id.fbe);
            this.f127414h = (TextView) this.itemView.findViewById(R.id.cpq);
            this.f127415i = (TextView) this.itemView.findViewById(R.id.eez);
            this.f127417k = (TextView) this.itemView.findViewById(R.id.akb);
            this.f127412f = (RemoteImageView) this.itemView.findViewById(R.id.a47);
            this.f127421o = (TuxIconView) this.itemView.findViewById(R.id.b6o);
        }

        public C55890a(View view) {
            super(view);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a.C55871b
        /* renamed from: a */
        public final void mo92729a(IMContact iMContact, int i) {
            if (iMContact.getType() != -1) {
                if (C55889f.this.f127351k != null) {
                    this.itemView.setOnClickListener(new View.OnClickListener() {
                        /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.C55889f.C55890a.View$OnClickListenerC558911 */

                        static {
                            Covode.recordClassIndex(65681);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            C55889f.this.f127351k.mo92728a(C55890a.this.itemView, C55890a.this.getAdapterPosition());
                        }
                    });
                    this.f127411e.setOnClickListener(new View.OnClickListener() {
                        /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.C55889f.C55890a.View$OnClickListenerC558922 */

                        static {
                            Covode.recordClassIndex(65682);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            C55889f.this.f127351k.mo92728a(C55890a.this.f127411e, C55890a.this.getAdapterPosition());
                        }
                    });
                    this.f127412f.setOnClickListener(new View.OnClickListener() {
                        /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.C55889f.C55890a.View$OnClickListenerC558933 */

                        static {
                            Covode.recordClassIndex(65683);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            C55889f.this.f127351k.mo92728a(C55890a.this.f127412f, C55890a.this.getAdapterPosition());
                        }
                    });
                }
                this.f127420n.setVisibility(8);
                if (iMContact.getType() == 6 || iMContact.getType() == 5) {
                    if (iMContact.getType() != 5 || !TextUtils.isEmpty(C55889f.this.f127345e)) {
                        this.f127423q.setVisibility(8);
                        this.f127422p.setVisibility(8);
                    } else {
                        this.f127423q.setVisibility(0);
                        this.f127416j.setText(R.string.cfi);
                        this.f127420n.setVisibility(0);
                        this.f127422p.setVisibility(8);
                    }
                    this.f127418l.setVisibility(8);
                } else if (iMContact.getType() == 0 || iMContact.getType() == 3) {
                    if (iMContact.getType() != 3 || !TextUtils.isEmpty(C55889f.this.f127345e)) {
                        this.f127423q.setVisibility(8);
                        this.f127422p.setVisibility(8);
                    } else {
                        this.f127423q.setVisibility(0);
                        this.f127416j.setText(R.string.cfh);
                        this.f127420n.setVisibility(8);
                        this.f127422p.setVisibility(0);
                    }
                    if (C55889f.this.f127341a != 1) {
                        C55879c.C55881b c = C55889f.this.mo92742c(i);
                        if (c != null) {
                            if (!TextUtils.isEmpty(c.f127387d)) {
                                this.f127418l.setText(c.f127387d);
                                this.f127418l.setVisibility(0);
                            } else {
                                this.f127418l.setVisibility(8);
                            }
                        }
                    } else {
                        this.f127418l.setVisibility(8);
                    }
                }
                if (i == 0) {
                    this.f127416j.setText("");
                    this.f127420n.setVisibility(8);
                }
                UrlModel displayAvatar = iMContact.getDisplayAvatar();
                if (displayAvatar == null || displayAvatar.getUrlList() == null || displayAvatar.getUrlList().size() == 0) {
                    C34577e.m70591a(this.f127411e, 2131232314);
                } else {
                    C34577e.m70592a(this.f127411e, displayAvatar);
                }
                this.f127412f.setVisibility(8);
                if (iMContact instanceof IMUser) {
                    IMUser iMUser = (IMUser) iMContact;
                    C80581io.m139704a(this.itemView.getContext(), iMUser.getCustomVerify(), iMUser.getEnterpriseVerifyReason(), this.f127414h);
                    C55889f.m101639a(this.f127414h, iMUser, C55889f.this.f127345e);
                    C55889f.m101641b(this.f127417k, iMUser, C55889f.this.f127345e);
                    if (iMUser.getFollowStatus() == 2) {
                        this.f127421o.setVisibility(0);
                    } else {
                        this.f127421o.setVisibility(8);
                    }
                    this.f127415i.setVisibility(8);
                    C55161a.m100872a(this.f127411e, iMUser);
                } else if (iMContact instanceof IMConversation) {
                    IMConversation iMConversation = (IMConversation) iMContact;
                    C80581io.m139704a(this.itemView.getContext(), "", "", this.f127414h);
                    this.f127415i.setVisibility(8);
                    this.f127421o.setVisibility(8);
                    int conversationMemberCount = iMConversation.getConversationMemberCount();
                    this.f127417k.setText(this.f127417k.getContext().getResources().getQuantityString(R.plurals.cu, conversationMemberCount, Integer.valueOf(conversationMemberCount)));
                    if (TextUtils.isEmpty(C55889f.this.f127345e)) {
                        this.f127414h.setText(iMConversation.getDisplayName());
                    } else {
                        C55889f.m101640a(this.f127414h, iMConversation.getDisplayName(), C55889f.this.f127345e, 0);
                    }
                }
                this.f127412f.setTag(83886080, iMContact);
                this.itemView.setTag(83886080, iMContact);
                this.f127411e.setTag(83886080, iMContact);
                this.itemView.setTag(50331648, 50331648);
                this.f127412f.setTag(50331648, 100663296);
                this.f127411e.setTag(50331648, 50331649);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a, com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.C55879c
    /* renamed from: a */
    public final AbstractC55867a.C55871b mo92714a(ViewGroup viewGroup, int i) {
        int i2;
        if (i == 1 && this.f127347g != null) {
            return super.mo92714a(viewGroup, i);
        }
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            i2 = R.layout.a6c;
        } else {
            i2 = R.layout.a6e;
        }
        return new C55890a(C1764a.m5927a(from, i2, viewGroup, false));
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m101691a(C55889f fVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(3246);
        AbstractC55867a.C55871b a2 = fVar.mo92714a(viewGroup, i);
        try {
            if (a2.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) a2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(a2.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = a2.getClass().getName();
        MethodCollector.m26664o(3246);
        return a2;
    }
}

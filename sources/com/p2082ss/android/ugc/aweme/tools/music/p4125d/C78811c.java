package com.p2082ss.android.ugc.aweme.tools.music.p4125d;

import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40895j;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Locale;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.d.c */
public class C78811c extends RecyclerView.ViewHolder {

    /* renamed from: e */
    public static final C78813a f177123e = new C78813a((byte) 0);

    /* renamed from: a */
    public AVDmtImageTextView f177124a;

    /* renamed from: b */
    public SimpleDraweeView f177125b;

    /* renamed from: c */
    public AVDmtTextView f177126c;

    /* renamed from: d */
    public final AbstractC40895j f177127d;

    /* renamed from: f */
    private Animation f177128f;

    static {
        Covode.recordClassIndex(91954);
    }

    /* renamed from: c */
    public boolean mo122641c() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.c$a */
    public static final class C78813a {
        static {
            Covode.recordClassIndex(91956);
        }

        private C78813a() {
        }

        public /* synthetic */ C78813a(byte b) {
            this();
        }

        /* renamed from: a */
        public static View m137577a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            C89219l.m154721d(layoutInflater, "");
            C89219l.m154721d(viewGroup, "");
            View a = C1764a.m5927a(layoutInflater, R.layout.dl, viewGroup, false);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: a */
    public final void mo122637a() {
        AVDmtImageTextView aVDmtImageTextView = this.f177124a;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.mo121334a(0.66f);
        }
        AVDmtImageTextView aVDmtImageTextView2 = this.f177124a;
        if (aVDmtImageTextView2 != null) {
            aVDmtImageTextView2.mo121341b(true);
        }
    }

    /* renamed from: b */
    public final void mo122640b() {
        AVDmtImageTextView aVDmtImageTextView = this.f177124a;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.mo121334a(1.0f);
        }
        AVDmtImageTextView aVDmtImageTextView2 = this.f177124a;
        if (aVDmtImageTextView2 != null) {
            aVDmtImageTextView2.mo121341b(false);
        }
    }

    /* renamed from: a */
    public final void mo122639a(boolean z) {
        AVDmtImageTextView aVDmtImageTextView = this.f177124a;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.mo121340a(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78811c(final View view, AbstractC40895j jVar) {
        super(view);
        C89219l.m154721d(view, "");
        this.f177127d = jVar;
        this.f177124a = (AVDmtImageTextView) view.findViewById(R.id.br2);
        this.f177125b = (SimpleDraweeView) view.findViewById(R.id.c1m);
        this.f177126c = (AVDmtTextView) view.findViewById(R.id.ezr);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.f177128f = alphaAnimation;
        alphaAnimation.setDuration(1000);
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.tools.music.p4125d.C78811c.View$OnClickListenerC788121 */

            /* renamed from: a */
            final /* synthetic */ C78811c f177129a;

            static {
                Covode.recordClassIndex(91955);
            }

            {
                this.f177129a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC40895j jVar = this.f177129a.f177127d;
                if (jVar != null) {
                    jVar.mo70092a(view, this.f177129a.getAdapterPosition());
                }
            }
        });
    }

    /* renamed from: a */
    public void mo122638a(MusicModel musicModel, boolean z, boolean z2) {
        String str;
        boolean z3;
        String str2;
        String a;
        String picPremium;
        String str3 = null;
        if (musicModel != null) {
            str = musicModel.getName();
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            AVDmtImageTextView aVDmtImageTextView = this.f177124a;
            if (aVDmtImageTextView != null) {
                AVDmtTextView aVDmtTextView = aVDmtImageTextView.f174454b;
                if (aVDmtTextView == null) {
                    C89219l.m154710a("dmtTextView");
                }
                aVDmtTextView.setText("");
            }
        } else {
            AVDmtImageTextView aVDmtImageTextView2 = this.f177124a;
            if (aVDmtImageTextView2 != null) {
                if (musicModel != null) {
                    str2 = musicModel.getName();
                } else {
                    str2 = null;
                }
                aVDmtImageTextView2.setText(str2);
            }
        }
        AVDmtImageTextView aVDmtImageTextView3 = this.f177124a;
        if (aVDmtImageTextView3 != null) {
            if (musicModel == null || (picPremium = musicModel.getPicPremium()) == null || picPremium.length() == 0) {
                aVDmtImageTextView3.mo121336a(new ColorDrawable(0));
                aVDmtImageTextView3.mo121333a();
            } else {
                if (musicModel != null) {
                    str3 = musicModel.getPicPremium();
                }
                aVDmtImageTextView3.mo121338a(str3);
            }
        }
        if (mo122641c()) {
            if (musicModel != null) {
                AVDmtTextView aVDmtTextView2 = this.f177126c;
                if (aVDmtTextView2 != null) {
                    int presenterDuration = musicModel.getPresenterDuration() / 1000;
                    int i = presenterDuration % 60;
                    int i2 = presenterDuration / 60;
                    int i3 = i2 / 60;
                    int i4 = i2 % 60;
                    if (i3 == 0) {
                        a = C1764a.m5929a(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i)}, 2));
                        C89219l.m154716b(a, "");
                    } else {
                        a = C1764a.m5929a(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i)}, 3));
                        C89219l.m154716b(a, "");
                    }
                    aVDmtTextView2.setText(a);
                }
                AVDmtTextView aVDmtTextView3 = this.f177126c;
                if (aVDmtTextView3 != null) {
                    aVDmtTextView3.setVisibility(0);
                }
            } else {
                AVDmtTextView aVDmtTextView4 = this.f177126c;
                if (aVDmtTextView4 != null) {
                    aVDmtTextView4.setVisibility(8);
                }
            }
        }
        mo122639a(z);
        if (musicModel == null) {
            SimpleDraweeView simpleDraweeView = this.f177125b;
            if (simpleDraweeView == null) {
                C89219l.m154715b();
            }
            simpleDraweeView.setVisibility(8);
        } else if (musicModel.isMvThemeMusic()) {
            SimpleDraweeView simpleDraweeView2 = this.f177125b;
            if (simpleDraweeView2 == null) {
                C89219l.m154715b();
            }
            simpleDraweeView2.setVisibility(0);
        } else {
            SimpleDraweeView simpleDraweeView3 = this.f177125b;
            if (simpleDraweeView3 == null) {
                C89219l.m154715b();
            }
            simpleDraweeView3.setVisibility(8);
        }
        if (z2) {
            AVDmtImageTextView aVDmtImageTextView4 = this.f177124a;
            if (aVDmtImageTextView4 != null) {
                aVDmtImageTextView4.mo121334a(0.66f);
            }
            AVDmtImageTextView aVDmtImageTextView5 = this.f177124a;
            if (aVDmtImageTextView5 != null) {
                aVDmtImageTextView5.mo121341b(true);
                return;
            }
            return;
        }
        AVDmtImageTextView aVDmtImageTextView6 = this.f177124a;
        if (aVDmtImageTextView6 != null) {
            aVDmtImageTextView6.mo121334a(1.0f);
        }
        AVDmtImageTextView aVDmtImageTextView7 = this.f177124a;
        if (aVDmtImageTextView7 != null) {
            aVDmtImageTextView7.mo121341b(false);
        }
    }
}

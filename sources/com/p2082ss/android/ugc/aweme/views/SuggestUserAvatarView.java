package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.friends.model.MutualStruct;
import com.p2082ss.android.ugc.aweme.friends.model.MutualUser;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.views.SuggestUserAvatarView */
public final class SuggestUserAvatarView extends FrameLayout {

    /* renamed from: b */
    public static final C81421a f181956b = new C81421a((byte) 0);

    /* renamed from: a */
    public boolean f181957a;

    /* renamed from: c */
    private int f181958c;

    /* renamed from: d */
    private int f181959d;

    /* renamed from: e */
    private final int f181960e;

    /* renamed from: f */
    private boolean f181961f;

    /* renamed from: g */
    private boolean f181962g;

    /* renamed from: h */
    private int f181963h;

    /* renamed from: i */
    private int f181964i;

    static {
        Covode.recordClassIndex(94781);
    }

    public SuggestUserAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.views.SuggestUserAvatarView$a */
    public static final class C81421a {
        static {
            Covode.recordClassIndex(94782);
        }

        private C81421a() {
        }

        public /* synthetic */ C81421a(byte b) {
            this();
        }

        /* renamed from: a */
        public static float m141180a(MutualStruct mutualStruct) {
            C89219l.m154721d(mutualStruct, "");
            if (mutualStruct.getTotal() > 3) {
                return 46.0f;
            }
            if (mutualStruct.getTotal() > 1) {
                return (((float) mutualStruct.getTotal()) * 20.0f) - (((float) (mutualStruct.getTotal() - 1)) * 7.0f);
            }
            return ((float) mutualStruct.getTotal()) * 20.0f;
        }
    }

    public final void setDarkMode(boolean z) {
        this.f181961f = z;
    }

    public final void setSocialVideoTag(boolean z) {
        this.f181962g = z;
    }

    /* renamed from: a */
    public static boolean m141175a(MutualStruct mutualStruct) {
        C89219l.m154721d(mutualStruct, "");
        List<MutualUser> userList = mutualStruct.getUserList();
        if (userList == null || !(!userList.isEmpty())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo125058b(MutualStruct mutualStruct) {
        List<MutualUser> userList;
        int i;
        C89219l.m154721d(mutualStruct, "");
        setVisibility(8);
        if (m141175a(mutualStruct) && (userList = mutualStruct.getUserList()) != null) {
            setVisibility(0);
            removeAllViews();
            int size = userList.size();
            int i2 = 0;
            while (true) {
                i = 99;
                if (i2 >= size) {
                    break;
                } else if (userList.get(i2) != null) {
                    boolean z = true;
                    if (i2 >= userList.size() - 1 && mutualStruct.getTotal() <= userList.size()) {
                        z = false;
                    }
                    View a = m141174a(userList.get(i2), i2, z);
                    if (i2 == 2) {
                        if (userList.size() == 3 && userList.size() == mutualStruct.getTotal()) {
                            addView(m141174a(userList.get(i2), i2, false));
                        }
                    } else if (i2 >= 2) {
                        break;
                    } else {
                        addView(a);
                        i2++;
                    }
                } else {
                    return;
                }
            }
            int total = mutualStruct.getTotal() - 2;
            if (total > 99) {
                total = 99;
            }
            addView(m141176c(i2, total));
            if (userList.size() != 0 && userList.size() <= 2 && userList.size() < mutualStruct.getTotal()) {
                int total2 = mutualStruct.getTotal() - userList.size();
                int size2 = userList.size();
                if (total2 <= 99) {
                    i = total2;
                }
                addView(m141176c(size2, i));
            }
        }
    }

    /* renamed from: a */
    public final void mo125056a(int i, int i2) {
        this.f181963h = i;
        this.f181964i = i2;
    }

    /* renamed from: b */
    public final void mo125057b(int i, int i2) {
        if (!(i == this.f181959d && i2 == this.f181958c) && getChildCount() > 0) {
            removeAllViews();
        }
        this.f181959d = i;
        this.f181958c = i2;
    }

    /* renamed from: c */
    private final View m141176c(int i, int i2) {
        View inflate;
        MethodCollector.m26663i(12392);
        if (this.f181957a) {
            int i3 = this.f181963h;
            int i4 = this.f181964i;
            Context context = getContext();
            C89219l.m154716b(context, "");
            TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
            int i5 = this.f181959d;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i5);
            if (C80471gb.m139483a(tuxTextView.getContext())) {
                layoutParams.setMargins(0, 0, this.f181958c * i, 0);
            } else {
                layoutParams.setMargins(this.f181958c * i, 0, 0, 0);
            }
            tuxTextView.setLayoutParams(layoutParams);
            tuxTextView.setGravity(17);
            tuxTextView.setLines(1);
            tuxTextView.setTextColor(i4);
            tuxTextView.setTuxFont(72);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            Integer valueOf = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 1.0f, system.getDisplayMetrics())));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            Integer valueOf2 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 1.0f, system2.getDisplayMetrics())));
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            Integer valueOf3 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 1.0f, system3.getDisplayMetrics())));
            Resources system4 = Resources.getSystem();
            C89219l.m154709a((Object) system4, "");
            C23163i.m43660a((View) tuxTextView, valueOf, valueOf2, valueOf3, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 1.0f, system4.getDisplayMetrics()))), false, 16);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            if (paint != null) {
                paint.setStyle(Paint.Style.FILL);
            }
            Paint paint2 = shapeDrawable.getPaint();
            if (paint2 != null) {
                paint2.setColor(i3);
            }
            Paint paint3 = shapeDrawable.getPaint();
            if (paint3 != null) {
                paint3.setAntiAlias(true);
            }
            tuxTextView.setBackground(shapeDrawable);
            tuxTextView.setText(tuxTextView.getContext().getString(R.string.f63, Integer.valueOf(i2)));
            MethodCollector.m26664o(12392);
            return tuxTextView;
        }
        if (this.f181961f) {
            inflate = LayoutInflater.from(getContext()).inflate(R.layout.afx, (ViewGroup) null);
        } else {
            inflate = LayoutInflater.from(getContext()).inflate(R.layout.afw, (ViewGroup) null);
        }
        int i6 = this.f181959d;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i6, i6);
        if (C80471gb.m139483a(inflate.getContext())) {
            layoutParams2.setMargins(0, 0, this.f181958c * i, 0);
        } else {
            layoutParams2.setMargins(this.f181958c * i, 0, 0, 0);
        }
        inflate.setLayoutParams(layoutParams2);
        TextView textView = (TextView) inflate.findViewById(R.id.f0f);
        C89219l.m154716b(textView, "");
        textView.setText(getContext().getString(R.string.f63, Integer.valueOf(i2)));
        C89219l.m154716b(inflate, "");
        MethodCollector.m26664o(12392);
        return inflate;
    }

    private /* synthetic */ SuggestUserAvatarView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SuggestUserAvatarView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        int i;
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12515);
        this.f181958c = (int) C13628n.m24520b(context, 13.0f);
        this.f181959d = (int) C13628n.m24520b(context, 20.0f);
        this.f181960e = (int) C13628n.m24520b(context, 1.0f);
        boolean z = this.f181961f;
        int i2 = R.color.c7;
        if (z) {
            i = R.color.c7;
        } else {
            i = R.color.k;
        }
        this.f181963h = C0643b.m2378c(context, i);
        this.f181964i = C0643b.m2378c(context, !this.f181961f ? R.color.bx : i2);
        MethodCollector.m26664o(12515);
    }

    /* renamed from: a */
    private final View m141174a(MutualUser mutualUser, int i, boolean z) {
        View inflate;
        Float f;
        MethodCollector.m26663i(12388);
        UrlModel urlModel = null;
        if (this.f181957a) {
            int i2 = this.f181958c;
            int i3 = i * i2;
            if (z) {
                f = Float.valueOf((float) i2);
            } else {
                f = null;
            }
            Context context = getContext();
            C89219l.m154716b(context, "");
            C81460p pVar = new C81460p(context, f, (byte) 0);
            int i4 = this.f181959d;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i4);
            if (C80471gb.m139483a(pVar.getContext())) {
                layoutParams.setMargins(0, 0, i3, 0);
            } else {
                layoutParams.setMargins(i3, 0, 0, 0);
            }
            pVar.setLayoutParams(layoutParams);
            if (mutualUser != null) {
                urlModel = mutualUser.getAvatarMedium();
            }
            C34577e.m70592a(pVar, urlModel);
            MethodCollector.m26664o(12388);
            return pVar;
        }
        if (this.f181961f) {
            inflate = LayoutInflater.from(getContext()).inflate(R.layout.afv, (ViewGroup) null);
        } else {
            inflate = LayoutInflater.from(getContext()).inflate(R.layout.afu, (ViewGroup) null);
        }
        if (this.f181962g) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(C0643b.m2378c(inflate.getContext(), R.color.l));
            inflate.setBackground(gradientDrawable);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            Integer valueOf = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 1.0f, system.getDisplayMetrics())));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            Integer valueOf2 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 1.0f, system2.getDisplayMetrics())));
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            Integer valueOf3 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 1.0f, system3.getDisplayMetrics())));
            Resources system4 = Resources.getSystem();
            C89219l.m154709a((Object) system4, "");
            C23163i.m43660a(inflate, valueOf, valueOf2, valueOf3, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 1.0f, system4.getDisplayMetrics()))), false, 16);
        } else if (this.f181961f && i == 0) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(1);
            gradientDrawable2.setStroke(2, C0643b.m2378c(inflate.getContext(), R.color.h));
            inflate.setBackground(gradientDrawable2);
        }
        int i5 = this.f181959d;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i5, i5);
        if (C80471gb.m139483a(inflate.getContext())) {
            layoutParams2.setMargins(0, 0, this.f181958c * i, 0);
        } else {
            layoutParams2.setMargins(this.f181958c * i, 0, 0, 0);
        }
        inflate.setLayoutParams(layoutParams2);
        RemoteImageView remoteImageView = (RemoteImageView) inflate.findViewById(R.id.nz);
        if (mutualUser != null) {
            urlModel = mutualUser.getAvatarMedium();
        }
        C34577e.m70592a(remoteImageView, urlModel);
        C89219l.m154716b(inflate, "");
        MethodCollector.m26664o(12388);
        return inflate;
    }
}

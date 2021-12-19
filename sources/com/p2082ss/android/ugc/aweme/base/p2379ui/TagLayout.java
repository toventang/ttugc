package com.p2082ss.android.ugc.aweme.base.p2379ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23159f;
import com.bytedance.tux.tag.TuxTag;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34715b;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.comment.p2490d.C36410g;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38622af;
import com.p2082ss.android.ugc.aweme.experiment.C47008he;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInterestLevel;
import com.p2082ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50089ay;
import com.p2082ss.android.ugc.aweme.friends.C51487e;
import com.p2082ss.android.ugc.aweme.friends.model.MutualStruct;
import com.p2082ss.android.ugc.aweme.social.ext.C74729a;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.ui.TagLayout */
public class TagLayout extends LinearLayout {

    /* renamed from: a */
    public static final List<String> f81905a = Arrays.asList("People you may know", "follows_you", "from your contacts");

    /* renamed from: f */
    public static final C34666a f81906f = new C34666a(20);

    /* renamed from: g */
    private static final int f81907g = C34728n.m70946a(5.0d);

    /* renamed from: b */
    public Context f81908b;

    /* renamed from: c */
    public String f81909c;

    /* renamed from: d */
    public Aweme f81910d;

    /* renamed from: e */
    public TextView f81911e;

    /* renamed from: h */
    private int f81912h;

    /* renamed from: i */
    private boolean f81913i;

    /* renamed from: b */
    private void m70802b() {
        TextView textView = this.f81911e;
        if (textView != null) {
            removeView(textView);
        }
    }

    private static int getMutualLablesTotalWidth() {
        double b = (double) C34723i.m70928b(C17867d.m33078a());
        Double.isNaN(b);
        return (int) (b * 0.65d);
    }

    static {
        Covode.recordClassIndex(41648);
    }

    /* renamed from: a */
    private boolean m70800a() {
        if (!C36410g.m74111b() || this.f81910d.getInteractionTagInfo() == null || this.f81910d.getInteractionTagInfo().getInterestLevel() != InteractionTagInterestLevel.HIGH.getLevel() || TextUtils.isEmpty(this.f81910d.getInteractionTagInfo().getVideoLabelText())) {
            return false;
        }
        return true;
    }

    public void setEventType(String str) {
        this.f81909c = str;
    }

    public void setFeedFromPage(int i) {
        this.f81912h = i;
    }

    public void setFromPostPage(boolean z) {
        this.f81913i = z;
    }

    public TagLayout(Context context) {
        this(context, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.TagLayout$a */
    public static class C34666a {

        /* renamed from: a */
        public final int f81919a = 7;

        /* renamed from: b */
        public final int f81920b;

        static {
            Covode.recordClassIndex(41651);
        }

        public C34666a(int i) {
            this.f81920b = i;
        }

        /* renamed from: a */
        public final int mo61324a(Context context) {
            return (C34723i.m70928b(context) - C23159f.m43650b(Integer.valueOf(this.f81919a))) - C23159f.m43650b(120);
        }
    }

    /* renamed from: a */
    private boolean m70801a(Aweme aweme) {
        List<String> geofencingRegions;
        if (this.f81913i && (geofencingRegions = aweme.getGeofencingRegions()) != null && !geofencingRegions.isEmpty()) {
            return true;
        }
        return false;
    }

    private void setSocialVideoTagView(String str) {
        if (this.f81910d.getInteractionTagInfo() != null) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                removeView(childAt);
            }
            ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) C13628n.m24520b(this.f81908b, 19.0f));
            LinearLayout linearLayout = (LinearLayout) C1764a.m5927a(LayoutInflater.from(this.f81908b), R.layout.sn, this, false);
            TuxTag tuxTag = (TuxTag) linearLayout.findViewById(R.id.ey1);
            tuxTag.setTagSize(3);
            tuxTag.setText(str);
            tuxTag.setTagTextColor(this.f81908b.getResources().getColor(R.color.bx));
            tuxTag.setTagBackgroundColor(this.f81908b.getResources().getColor(R.color.l));
            addView(linearLayout, 0, layoutParams);
        }
    }

    private void setGeoFencingTag(Aweme aweme) {
        String str;
        m70796a(1, getChildCount());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) C13628n.m24520b(this.f81908b, 19.0f));
        layoutParams.leftMargin = (int) C13628n.m24520b(this.f81908b, 0.0f);
        View childAt = getChildAt(0);
        if (childAt != null) {
            removeView(childAt);
        }
        LinearLayout linearLayout = (LinearLayout) C1764a.m5927a(LayoutInflater.from(this.f81908b), R.layout.so, this, false);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(C0643b.m2378c(getContext(), R.color.aa));
        gradientDrawable.setCornerRadius(C13628n.m24520b(this.f81908b, 2.0f));
        linearLayout.setBackground(gradientDrawable);
        ((RemoteImageView) linearLayout.findViewById(R.id.bx2)).setImageResource(2131231542);
        TextView textView = (TextView) linearLayout.findViewById(R.id.ey1);
        List<String> geofencingRegions = aweme.getGeofencingRegions();
        if (geofencingRegions == null || geofencingRegions.isEmpty()) {
            str = "";
        } else if (geofencingRegions.size() == 1) {
            str = this.f81908b.getString(R.string.ca4, geofencingRegions.get(0));
        } else {
            str = this.f81908b.getString(R.string.ca3, geofencingRegions.get(0), Integer.valueOf(geofencingRegions.size() - 1));
        }
        textView.setText(str);
        textView.setTextColor(C0643b.m2378c(getContext(), R.color.c5));
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        addView(linearLayout, 0, layoutParams);
    }

    private void setMutualTagView(MutualStruct mutualStruct) {
        if (mutualStruct != null && TextUtils.equals(this.f81909c, "homepage_hot")) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                removeView(childAt);
            }
            if (!C47008he.m90283b() || this.f81910d.getRelationRecommendInfo() == null) {
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                LinearLayout linearLayout = (LinearLayout) C1764a.m5927a(LayoutInflater.from(this.f81908b), R.layout.afn, this, false);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(C0643b.m2378c(this.f81908b, R.color.l));
                gradientDrawable.setCornerRadius(C13628n.m24520b(this.f81908b, 2.0f));
                linearLayout.setBackground(gradientDrawable);
                MutualRelationView mutualRelationView = (MutualRelationView) linearLayout.findViewById(R.id.ebg);
                mutualRelationView.mo125023a(mutualStruct, C51487e.m95908e());
                mutualRelationView.f181901a.setTuxFont(62);
                mutualRelationView.setTextColor(C0643b.m2378c(this.f81908b, R.color.bx));
                mutualRelationView.setTvMaxWidth(getMutualLablesTotalWidth());
                addView(linearLayout, 0, layoutParams);
            }
        }
    }

    /* renamed from: a */
    public final View mo61316a(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getTag() instanceof Integer) && i == ((Integer) childAt.getTag()).intValue()) {
                return childAt;
            }
        }
        return null;
    }

    public TagLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private void m70796a(int i, int i2) {
        if (i < i2) {
            while (i < i2) {
                removeView(getChildAt(i));
                i++;
            }
        }
    }

    /* renamed from: a */
    private static TextView m70795a(TuxTextView tuxTextView, AwemeTextLabelModel awemeTextLabelModel) {
        C38622af.m78381a(tuxTextView, awemeTextLabelModel);
        tuxTextView.setTag(Integer.valueOf(awemeTextLabelModel.getLabelType()));
        tuxTextView.setText(awemeTextLabelModel.getLabelName());
        tuxTextView.setTuxFont(61);
        tuxTextView.setTextColor(Color.parseColor(awemeTextLabelModel.getTextColor()));
        tuxTextView.setGravity(16);
        tuxTextView.setBackgroundDrawable(C34729o.m70951a(Color.parseColor(awemeTextLabelModel.getBgColor()), (float) C34728n.m70946a(4.0d)));
        int i = f81907g;
        tuxTextView.setPadding(i, 0, i, 0);
        tuxTextView.setSingleLine();
        tuxTextView.setMaxEms(20);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setVisibility(0);
        tuxTextView.setAlpha(1.0f);
        return tuxTextView;
    }

    /* renamed from: a */
    private void m70798a(Aweme aweme, C34666a aVar) {
        if (!(aweme == null || aweme.getTextVideoLabels() == null)) {
            m70796a(aweme.getTextVideoLabels().size(), getChildCount());
            for (int i = 0; i < aweme.getTextVideoLabels().size(); i++) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) C13628n.m24520b(this.f81908b, (float) aVar.f81920b));
                if (i == 0) {
                    layoutParams.leftMargin = (int) C13628n.m24520b(this.f81908b, 0.0f);
                } else {
                    layoutParams.leftMargin = (int) C13628n.m24520b(this.f81908b, (float) aVar.f81919a);
                }
                AwemeTextLabelModel awemeTextLabelModel = aweme.getTextVideoLabels().get(i);
                if (awemeTextLabelModel != null) {
                    View childAt = getChildAt(i);
                    if (childAt == null) {
                        TuxTextView tuxTextView = new TuxTextView(getContext());
                        addView(tuxTextView, -1, layoutParams);
                        m70795a(tuxTextView, awemeTextLabelModel);
                    } else if (childAt instanceof TuxTextView) {
                        m70795a((TuxTextView) getChildAt(i), awemeTextLabelModel);
                    } else {
                        removeView(childAt);
                        TuxTextView tuxTextView2 = new TuxTextView(getContext());
                        addView(tuxTextView2, i, layoutParams);
                        m70795a(tuxTextView2, awemeTextLabelModel);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m70799a(List<AwemeLabelModel> list, C34666a aVar) {
        if (list != null) {
            m70796a(list.size(), getChildCount());
            for (int i = 0; i < list.size(); i++) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) C13628n.m24520b(this.f81908b, (float) aVar.f81920b));
                if (i == 0) {
                    layoutParams.leftMargin = (int) C13628n.m24520b(this.f81908b, 0.0f);
                } else {
                    layoutParams.leftMargin = (int) C13628n.m24520b(this.f81908b, (float) aVar.f81919a);
                }
                AwemeLabelModel awemeLabelModel = list.get(i);
                View childAt = getChildAt(i);
                if (childAt != null && !(childAt instanceof RemoteImageView)) {
                    removeView(childAt);
                    childAt = null;
                }
                RemoteImageView remoteImageView = (RemoteImageView) childAt;
                if (awemeLabelModel != null) {
                    if (remoteImageView == null) {
                        remoteImageView = new RemoteImageView(this.f81908b);
                        addView(remoteImageView, i, layoutParams);
                    } else {
                        remoteImageView.setLayoutParams(layoutParams);
                    }
                    remoteImageView.setVisibility(0);
                    remoteImageView.setAlpha(1.0f);
                    UrlModel urlModels = awemeLabelModel.getUrlModels();
                    int labelType = awemeLabelModel.getLabelType();
                    remoteImageView.setTag(Integer.valueOf(labelType));
                    remoteImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    if (labelType == 3) {
                        remoteImageView.setVisibility(8);
                        removeView(remoteImageView);
                    } else {
                        C34577e.m70596a(remoteImageView, urlModels, new C50089ay(remoteImageView, this.f81908b));
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m70803b(com.p2082ss.android.ugc.aweme.feed.model.Aweme r17, com.p2082ss.android.ugc.aweme.base.p2379ui.TagLayout.C34666a r18) {
        /*
        // Method dump skipped, instructions count: 507
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.base.p2379ui.TagLayout.m70803b(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.base.ui.TagLayout$a):void");
    }

    private TagLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(5106);
        this.f81912h = -1;
        this.f81908b = context;
        MethodCollector.m26664o(5106);
    }

    /* renamed from: b */
    public final void mo61318b(Aweme aweme, List<AwemeLabelModel> list, C34666a aVar) {
        this.f81910d = aweme;
        m70802b();
        int i = 8;
        if (aweme == null || TextUtils.equals(this.f81909c, "westwindow")) {
            setVisibility(8);
            return;
        }
        if (m70801a(aweme)) {
            setGeoFencingTag(aweme);
        } else if (m70800a()) {
            setSocialVideoTagView(aweme.getInteractionTagInfo().getVideoLabelText());
        } else if (aweme.getMutualRelation() != null && C51487e.m95905b()) {
            setMutualTagView(aweme.getMutualRelation());
        } else if (aweme.getHybridLabels() != null && aweme.getHybridLabels().size() > 0) {
            m70803b(aweme, aVar);
        } else if (aweme.getTextVideoLabels() == null || aweme.getTextVideoLabels().size() <= 0) {
            m70799a(list, aVar);
        } else {
            m70798a(aweme, aVar);
        }
        if (getChildCount() > 0) {
            i = 0;
        }
        setVisibility(i);
    }

    /* renamed from: c */
    public final void mo61319c(Aweme aweme, List<AwemeLabelModel> list, C34666a aVar) {
        boolean z;
        String str;
        int i;
        this.f81910d = aweme;
        m70802b();
        int i2 = 8;
        if (aweme == null) {
            setVisibility(8);
            return;
        }
        if (m70800a()) {
            setSocialVideoTagView(aweme.getInteractionTagInfo().getVideoLabelText());
        } else if (aweme.getMutualRelation() != null && C51487e.m95905b()) {
            setMutualTagView(aweme.getMutualRelation());
        } else if (aweme.getHybridLabels() != null && aweme.getHybridLabels().size() > 0) {
            m70803b(aweme, aVar);
        } else if (aweme.getTextVideoLabels() == null || aweme.getTextVideoLabels().size() <= 0) {
            m70799a(list, aVar);
            RelationDynamicLabel relationLabel = aweme.getRelationLabel();
            if (relationLabel != null && relationLabel.isValid()) {
                int i3 = 16;
                if (this.f81911e == null) {
                    TuxTextView tuxTextView = new TuxTextView(getContext());
                    tuxTextView.setTuxFont(61);
                    tuxTextView.setTextColor(C17867d.m33078a().getResources().getColor(R.color.iv));
                    tuxTextView.setGravity(16);
                    tuxTextView.setBackgroundDrawable(C34729o.m70951a(C17867d.m33078a().getResources().getColor(R.color.l), (float) C34728n.m70946a(4.0d)));
                    int i4 = f81907g;
                    tuxTextView.setPadding(i4, 0, i4, 0);
                    tuxTextView.setSingleLine();
                    this.f81911e = tuxTextView;
                }
                String nickname = relationLabel.getNickname();
                String labelInfo = relationLabel.getLabelInfo();
                if (getChildCount() > 0) {
                    z = true;
                    i3 = 15;
                } else {
                    z = false;
                }
                if (TextUtils.isEmpty(nickname)) {
                    str = C34715b.m70905a(labelInfo, i3, "");
                } else {
                    String concat = "@".concat(String.valueOf(nickname));
                    float f = (float) i3;
                    float f2 = 0.0f;
                    if (labelInfo != null) {
                        int i5 = -1;
                        while (true) {
                            float f3 = 1.0f;
                            int i6 = i5 + 1;
                            if (i6 >= labelInfo.length()) {
                                break;
                            }
                            int i7 = 2;
                            if (C34715b.m70903a(labelInfo, i6) != 2) {
                                if (C34715b.m70907b(labelInfo, i6)) {
                                    f3 = 0.5f;
                                }
                                i7 = 1;
                            }
                            i5 += i7;
                            f2 += f3;
                        }
                    }
                    String a = C34715b.m70905a(concat, (int) Math.ceil((double) (f - f2)), C34715b.f82005a);
                    if (!TextUtils.isEmpty(a)) {
                        a = a + " ";
                    }
                    str = a + labelInfo;
                }
                this.f81911e.setText(str);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                if (z) {
                    i = C34728n.m70946a(6.0d);
                } else {
                    i = 0;
                }
                layoutParams.leftMargin = i;
                addView(this.f81911e, layoutParams);
            }
        } else {
            m70798a(aweme, aVar);
        }
        if (getChildCount() > 0) {
            i2 = 0;
        }
        setVisibility(i2);
    }

    /* renamed from: a */
    public final void mo61317a(Aweme aweme, List<AwemeLabelModel> list, C34666a aVar) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if (list.get(i).getLabelType() != 100) {
                    arrayList.add(list.get(i));
                    break;
                } else {
                    i++;
                }
            }
        }
        mo61318b(aweme, arrayList, aVar);
    }

    /* renamed from: a */
    private static void m70797a(Aweme aweme, int i, Integer num, AwemeHybridLabelModel awemeHybridLabelModel, TuxTextView tuxTextView) {
        if (aweme.getAuthor() != null) {
            tuxTextView.setMaxLines(1);
            tuxTextView.setMaxWidth(i);
            if (num != null) {
                i = num.intValue();
            }
            C74729a.m131189a(tuxTextView, null, aweme, Integer.valueOf(i));
            return;
        }
        tuxTextView.setText(awemeHybridLabelModel.getText());
    }
}

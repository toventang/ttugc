package com.p2082ss.android.ugc.aweme.tools.music.p4125d.p4127b;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63153f;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84926c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.d */
public final class C78767d extends AbstractC39060f<MusicModel> {

    /* renamed from: a */
    int f177020a = -1;

    /* renamed from: b */
    public View f177021b;

    /* renamed from: c */
    public AbstractC63153f f177022c;

    /* renamed from: d */
    private RecyclerView f177023d;

    static {
        Covode.recordClassIndex(91910);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.d$a */
    public static final class C78768a implements AbstractC39063h.AbstractC39067a {

        /* renamed from: a */
        final /* synthetic */ C78767d f177024a;

        /* renamed from: b */
        final /* synthetic */ AbstractC84926c.AbstractC84928a f177025b;

        static {
            Covode.recordClassIndex(91911);
        }

        C78768a(C78767d dVar, AbstractC84926c.AbstractC84928a aVar) {
            this.f177024a = dVar;
            this.f177025b = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
        /* renamed from: l */
        public final void mo62679l() {
            this.f177025b.mo112467a();
        }
    }

    /* renamed from: l */
    public static String m137505l() {
        C69905c cVar = C70005cr.m123611a().f156482a;
        if (cVar != null) {
            return cVar.getMusicId();
        }
        return null;
    }

    public C78767d(AbstractC63153f fVar) {
        C89219l.m154721d(fVar, "");
        this.f177022c = fVar;
    }

    /* renamed from: a */
    public final void mo122604a(int i) {
        this.f177020a = i;
        if (!C84892d.m145850a(this.f92236l)) {
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f177023d = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
    }

    /* renamed from: a */
    public final void mo122605a(AbstractC84926c.AbstractC84928a aVar) {
        mo67813a((AbstractC39063h.AbstractC39067a) new C78768a(this, aVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: c_ */
    public final int mo63367c_(View view) {
        C89219l.m154721d(view, "");
        return (int) C13628n.m24520b(view.getContext(), 48.0f);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a_ */
    public final RecyclerView.ViewHolder mo62748a_(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        RecyclerView.ViewHolder a_ = super.mo62748a_(viewGroup);
        this.f177021b = a_.itemView;
        RecyclerView.C1367j jVar = new RecyclerView.C1367j(-1, (int) C13628n.m24520b(viewGroup.getContext(), 48.0f));
        View view = this.f177021b;
        if (view != null) {
            view.setLayoutParams(jVar);
        }
        C89219l.m154716b(a_, "");
        return a_;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C89219l.m154716b(from, "");
        C89219l.m154721d(from, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(from, R.layout.bhi, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C78769e(a, this.f177022c);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        MusicModel musicModel;
        boolean a;
        boolean z;
        MusicModel.CollectionType collectionType;
        String a2;
        String picPremium;
        String str;
        String name;
        String str2;
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof C78769e) {
            List list = this.f92236l;
            if (list != null) {
                musicModel = (MusicModel) C89070n.m154561b(list, i);
            } else {
                musicModel = null;
            }
            C78769e eVar = (C78769e) viewHolder;
            boolean z2 = false;
            if (musicModel == null) {
                a = false;
            } else {
                a = C89219l.m154714a((Object) m137505l(), (Object) musicModel.getMusicId());
            }
            if (this.f177020a == i) {
                z = true;
            } else {
                z = false;
            }
            if (musicModel == null || (name = musicModel.getName()) == null || name.length() == 0) {
                TextView textView = eVar.f177029c;
                if (textView != null) {
                    textView.setText("");
                }
            } else {
                TextView textView2 = eVar.f177029c;
                if (textView2 != null) {
                    if (musicModel != null) {
                        str2 = musicModel.getName();
                    } else {
                        str2 = null;
                    }
                    textView2.setText(str2);
                }
            }
            AVDmtImageTextView aVDmtImageTextView = eVar.f177027a;
            if (aVDmtImageTextView != null) {
                if (musicModel == null || (picPremium = musicModel.getPicPremium()) == null || picPremium.length() == 0) {
                    aVDmtImageTextView.mo121336a(new ColorDrawable(0));
                    aVDmtImageTextView.mo121333a();
                } else {
                    if (musicModel != null) {
                        str = musicModel.getPicPremium();
                    } else {
                        str = null;
                    }
                    aVDmtImageTextView.mo121338a(str);
                }
            }
            if (musicModel != null) {
                TextView textView3 = eVar.f177028b;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                if (!TextUtils.isEmpty(musicModel.getSinger())) {
                    TextView textView4 = eVar.f177030d;
                    if (textView4 != null) {
                        textView4.setText(musicModel.getSinger());
                    }
                } else {
                    TextView textView5 = eVar.f177030d;
                    if (textView5 != null) {
                        textView5.setText("");
                    }
                }
                String singer = musicModel.getSinger();
                if (singer == null) {
                    singer = "";
                }
                if (musicModel != null) {
                    AVDmtImageTextView aVDmtImageTextView2 = eVar.f177027a;
                    if (aVDmtImageTextView2 != null) {
                        aVDmtImageTextView2.mo121340a(a);
                    }
                    if (a) {
                        TextView textView6 = eVar.f177029c;
                        if (textView6 != null) {
                            Context context = textView6.getContext();
                            C89219l.m154716b(context, "");
                            textView6.setTextColor(context.getResources().getColor(R.color.bh));
                            ViewGroup.LayoutParams layoutParams = textView6.getLayoutParams();
                            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.setMarginEnd((int) C13628n.m24520b(textView6.getContext(), 88.0f));
                            textView6.setLayoutParams(marginLayoutParams);
                        }
                        ImageView imageView = eVar.f177031e;
                        if (imageView != null) {
                            imageView.setVisibility(0);
                        }
                        if (eVar.f177033g.mo101527a()) {
                            ImageView imageView2 = eVar.f177031e;
                            if (imageView2 != null) {
                                imageView2.setAlpha(1.0f);
                            }
                            ImageView imageView3 = eVar.f177031e;
                            if (imageView3 != null) {
                                imageView3.setEnabled(true);
                            }
                        } else {
                            ImageView imageView4 = eVar.f177031e;
                            if (imageView4 != null) {
                                imageView4.setAlpha(0.5f);
                            }
                            ImageView imageView5 = eVar.f177031e;
                            if (imageView5 != null) {
                                imageView5.setEnabled(false);
                            }
                        }
                        ImageView imageView6 = eVar.f177032f;
                        if (imageView6 != null) {
                            imageView6.setVisibility(0);
                        }
                        TextView textView7 = eVar.f177030d;
                        if (textView7 != null) {
                            int a3 = C13628n.m24504a(textView7.getContext()) - ((int) C13628n.m24520b(textView7.getContext(), 211.0f));
                            Paint paint = textView7.getPaint();
                            if (paint == null) {
                                paint = new Paint();
                            }
                            if (paint.measureText(singer) > ((float) a3)) {
                                ViewGroup.LayoutParams layoutParams2 = textView7.getLayoutParams();
                                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                                layoutParams3.width = a3;
                                textView7.setLayoutParams(layoutParams3);
                            } else {
                                textView7.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                            }
                        }
                    } else {
                        TextView textView8 = eVar.f177029c;
                        if (textView8 != null) {
                            Context context2 = textView8.getContext();
                            C89219l.m154716b(context2, "");
                            textView8.setTextColor(context2.getResources().getColor(R.color.a9));
                            ViewGroup.LayoutParams layoutParams4 = textView8.getLayoutParams();
                            Objects.requireNonNull(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                            marginLayoutParams2.setMarginEnd((int) C13628n.m24520b(textView8.getContext(), 16.0f));
                            textView8.setLayoutParams(marginLayoutParams2);
                        }
                        TextView textView9 = eVar.f177030d;
                        if (textView9 != null) {
                            int a4 = C13628n.m24504a(textView9.getContext()) - ((int) C13628n.m24520b(textView9.getContext(), 150.0f));
                            Paint paint2 = textView9.getPaint();
                            if (paint2 == null) {
                                paint2 = new Paint();
                            }
                            if (paint2.measureText(singer) > ((float) a4)) {
                                ViewGroup.LayoutParams layoutParams5 = textView9.getLayoutParams();
                                Objects.requireNonNull(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                                layoutParams6.width = a4;
                                textView9.setLayoutParams(layoutParams6);
                            } else {
                                textView9.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                            }
                        }
                        ImageView imageView7 = eVar.f177031e;
                        if (imageView7 != null) {
                            imageView7.setVisibility(4);
                        }
                        ImageView imageView8 = eVar.f177032f;
                        if (imageView8 != null) {
                            imageView8.setVisibility(4);
                        }
                    }
                    TextView textView10 = eVar.f177028b;
                    if (textView10 != null) {
                        StringBuilder sb = new StringBuilder(" · ");
                        int presenterDuration = musicModel.getPresenterDuration() / 1000;
                        int i2 = presenterDuration % 60;
                        int i3 = presenterDuration / 60;
                        int i4 = i3 / 60;
                        int i5 = i3 % 60;
                        if (i4 == 0) {
                            a2 = C1764a.m5929a(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i2)}, 2));
                            C89219l.m154716b(a2, "");
                        } else {
                            a2 = C1764a.m5929a(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2)}, 3));
                            C89219l.m154716b(a2, "");
                        }
                        textView10.setText(sb.append(a2).toString());
                    }
                }
            } else {
                TextView textView11 = eVar.f177028b;
                if (textView11 != null) {
                    textView11.setVisibility(8);
                }
            }
            if (z) {
                AVDmtImageTextView aVDmtImageTextView3 = eVar.f177027a;
                if (aVDmtImageTextView3 != null) {
                    aVDmtImageTextView3.mo121334a(0.66f);
                }
                AVDmtImageTextView aVDmtImageTextView4 = eVar.f177027a;
                if (aVDmtImageTextView4 != null) {
                    aVDmtImageTextView4.mo121341b(true);
                }
            } else {
                AVDmtImageTextView aVDmtImageTextView5 = eVar.f177027a;
                if (aVDmtImageTextView5 != null) {
                    aVDmtImageTextView5.mo121334a(1.0f);
                }
                AVDmtImageTextView aVDmtImageTextView6 = eVar.f177027a;
                if (aVDmtImageTextView6 != null) {
                    aVDmtImageTextView6.mo121341b(false);
                }
            }
            ImageView imageView9 = eVar.f177032f;
            if (imageView9 != null) {
                if (musicModel != null) {
                    collectionType = musicModel.getCollectionType();
                } else {
                    collectionType = null;
                }
                if (collectionType != MusicModel.CollectionType.NOT_COLLECTED) {
                    z2 = true;
                }
                imageView9.setSelected(z2);
            }
            if (musicModel != null) {
                this.f177022c.mo101526a(musicModel, i);
            }
        }
    }
}

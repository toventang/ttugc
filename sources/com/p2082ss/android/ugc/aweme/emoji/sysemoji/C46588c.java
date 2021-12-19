package com.p2082ss.android.ugc.aweme.emoji.sysemoji;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.SwipeControlledRecycleView;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46583b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.c */
public final class C46588c extends PopupWindow {

    /* renamed from: d */
    public static final C46589a f108619d = new C46589a((byte) 0);

    /* renamed from: a */
    AbstractC46590b f108620a;

    /* renamed from: b */
    public final Activity f108621b;

    /* renamed from: c */
    public final SwipeControlledRecycleView f108622c;

    /* renamed from: e */
    private final View f108623e;

    /* renamed from: f */
    private final RecyclerView f108624f;

    /* renamed from: g */
    private final C46583b f108625g;

    /* renamed from: h */
    private C46605i f108626h;

    /* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.c$b */
    public interface AbstractC46590b {
        static {
            Covode.recordClassIndex(55180);
        }

        /* renamed from: a */
        void mo79185a(C46605i iVar, String str);
    }

    static {
        Covode.recordClassIndex(55178);
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.c$a */
    public static final class C46589a {
        static {
            Covode.recordClassIndex(55179);
        }

        private C46589a() {
        }

        public /* synthetic */ C46589a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo79183a() {
        View contentView = getContentView();
        C89219l.m154716b(contentView, "");
        return contentView.getMeasuredWidth();
    }

    /* renamed from: a */
    static int m89915a(int i) {
        int i2;
        if (i == -2) {
            i2 = 0;
        } else {
            i2 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46588c(Activity activity, SwipeControlledRecycleView swipeControlledRecycleView) {
        super(activity);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(swipeControlledRecycleView, "");
        this.f108621b = activity;
        this.f108622c = swipeControlledRecycleView;
        setHeight(-2);
        setWidth(-2);
        setOutsideTouchable(false);
        setFocusable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        C46583b bVar = new C46583b();
        this.f108625g = bVar;
        View a = C1764a.m5927a(LayoutInflater.from(activity), R.layout.z4, swipeControlledRecycleView, false);
        C89219l.m154716b(a, "");
        this.f108623e = a;
        View findViewById = a.findViewById(R.id.c_1);
        C89219l.m154716b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f108624f = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.mo4415b(new C46610m(6));
        recyclerView.setAdapter(bVar);
        setContentView(a);
    }

    /* renamed from: a */
    public final void mo79184a(C46605i iVar, MotionEvent motionEvent) {
        int i;
        int i2;
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(motionEvent, "");
        if (iVar.getEmojiList() != null) {
            int position = iVar.getPosition();
            C46605i iVar2 = this.f108626h;
            if (iVar2 == null || position != iVar2.getPosition()) {
                C89219l.m154721d(iVar, "");
                this.f108626h = iVar;
                C46583b bVar = this.f108625g;
                C89219l.m154721d(iVar, "");
                bVar.f108611a = iVar;
                bVar.f108612b = 0;
                List<C46583b.C46584a> a = bVar.mo79182a();
                List<String> emojiList = iVar.getEmojiList();
                if (!(emojiList == null || emojiList.isEmpty() || a == null)) {
                    a.clear();
                    List<String> emojiList2 = iVar.getEmojiList();
                    if (emojiList2 != null) {
                        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) emojiList2, 10));
                        Iterator<T> it = emojiList2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Boolean.valueOf(a.add(new C46583b.C46584a(it.next()))));
                        }
                    }
                    bVar.notifyDataSetChanged();
                }
                this.f108625g.notifyDataSetChanged();
            }
            int[] iArr = new int[2];
            this.f108623e.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            if (this.f108623e.getWidth() > 0) {
                int width = this.f108623e.getWidth();
                List<String> emojiList3 = iVar.getEmojiList();
                if (emojiList3 == null) {
                    C89219l.m154715b();
                }
                int size = width / emojiList3.size();
                C56244a.m102190b("EmojiPopUpWindow", " event.rawX  :" + motionEvent.getRawX() + " x " + i3 + " root:w " + this.f108623e.getWidth() + ' ');
                float f = (float) i3;
                if (motionEvent.getRawX() <= f) {
                    i = 0;
                } else if (motionEvent.getRawX() >= ((float) (i3 + this.f108623e.getWidth()))) {
                    List<String> emojiList4 = iVar.getEmojiList();
                    if (emojiList4 == null) {
                        C89219l.m154715b();
                    }
                    i = emojiList4.size() - 1;
                } else {
                    float rawX = motionEvent.getRawX() - f;
                    i = (int) (rawX / ((float) size));
                    C56244a.m102190b("EmojiPopUpWindow", " cal  :" + size + "  left " + rawX);
                }
                C46583b bVar2 = this.f108625g;
                if (bVar2.f108612b != i) {
                    if (i >= bVar2.mo79182a().size()) {
                        i2 = bVar2.mo79182a().size() - 1;
                    } else {
                        i2 = i;
                    }
                    bVar2.mo79182a().get(bVar2.f108612b).f108615b = false;
                    bVar2.mo79182a().get(i2).f108615b = true;
                    bVar2.f108612b = i2;
                    C46605i iVar3 = bVar2.f108611a;
                    if (iVar3 != null) {
                        iVar3.setPreviewEmoji(bVar2.mo79182a().get(i2).f108614a);
                    }
                    bVar2.notifyDataSetChanged();
                }
                if (motionEvent.getAction() == 1) {
                    AbstractC46590b bVar3 = this.f108620a;
                    if (bVar3 != null) {
                        List<String> emojiList5 = iVar.getEmojiList();
                        if (emojiList5 == null) {
                            C89219l.m154715b();
                        }
                        bVar3.mo79185a(iVar, emojiList5.get(i));
                    }
                    dismiss();
                }
            }
        }
    }
}

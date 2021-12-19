package com.p2082ss.android.ugc.aweme.shortvideo.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.p2363ba.C34408a;
import com.p2082ss.android.ugc.aweme.p2363ba.C34410b;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p2082ss.android.ugc.aweme.shortvideo.model.Mission;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MissionUser;
import com.p2082ss.android.ugc.aweme.shortvideo.p3788aa.AbstractC69754b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3788aa.C69753a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3788aa.C69755c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3792ae.C69805f;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73966as;
import com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80345dj;
import com.p2082ss.android.ugc.aweme.video.hashtag.C80733a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText */
public class HashTagMentionEditText extends MentionEditText implements AbstractC69754b {

    /* renamed from: E */
    private static final String f166422E = HashTagMentionEditText.class.getSimpleName();

    /* renamed from: F */
    private final int f166423F = 70;

    /* renamed from: G */
    private String f166424G = "";

    /* renamed from: H */
    private boolean f166425H;

    /* renamed from: I */
    private int f166426I;

    /* renamed from: J */
    private int f166427J;

    /* renamed from: K */
    private List<InputFilter> f166428K;

    /* renamed from: L */
    private AbstractC74124b f166429L;

    /* renamed from: M */
    private HashSet<String> f166430M = new HashSet<>();

    /* renamed from: N */
    private Boolean f166431N = false;

    /* renamed from: O */
    private C74123a f166432O = null;

    /* renamed from: P */
    private String f166433P = null;

    /* renamed from: Q */
    private C34410b f166434Q = null;

    /* renamed from: R */
    private int f166435R;

    /* renamed from: S */
    private boolean f166436S = false;

    /* renamed from: a */
    int f166437a;

    /* renamed from: b */
    C69753a f166438b;

    /* renamed from: c */
    C69755c f166439c;

    /* renamed from: d */
    int f166440d;

    /* renamed from: e */
    public String f166441e = "";

    /* renamed from: f */
    public String f166442f = getHint().toString();

    /* renamed from: g */
    public String f166443g = "";

    /* renamed from: h */
    C34408a f166444h = null;

    /* renamed from: i */
    AbstractC63199ax.AbstractC63200a f166445i;

    /* renamed from: j */
    View.OnFocusChangeListener f166446j = new View.OnFocusChangeListener() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText.View$OnFocusChangeListenerC741201 */

        static {
            Covode.recordClassIndex(86874);
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                if (!TextUtils.isEmpty(HashTagMentionEditText.this.f166441e)) {
                    HashTagMentionEditText hashTagMentionEditText = HashTagMentionEditText.this;
                    hashTagMentionEditText.addHashTag(hashTagMentionEditText.f166441e);
                    HashTagMentionEditText hashTagMentionEditText2 = HashTagMentionEditText.this;
                    hashTagMentionEditText2.setHint(hashTagMentionEditText2.f166442f);
                    HashTagMentionEditText.this.f166441e = "";
                }
            } else if (TextUtils.isEmpty(HashTagMentionEditText.this.getNoAdTagText())) {
                HashTagMentionEditText hashTagMentionEditText3 = HashTagMentionEditText.this;
                hashTagMentionEditText3.f166441e = hashTagMentionEditText3.getAdTag();
                HashTagMentionEditText.this.removeHashTag();
                HashTagMentionEditText hashTagMentionEditText4 = HashTagMentionEditText.this;
                hashTagMentionEditText4.f166442f = hashTagMentionEditText4.getHint().toString();
                HashTagMentionEditText.this.setHint(((Object) HashTagMentionEditText.this.getHint()) + HashTagMentionEditText.this.f166441e);
            }
        }
    };

    /* renamed from: k */
    InputFilter f166447k = new InputFilter() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText.C741212 */

        static {
            Covode.recordClassIndex(86875);
        }

        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            int length = spanned.length() - HashTagMentionEditText.this.f166443g.length();
            if (length < 0) {
                length = 0;
            }
            if (TextUtils.isEmpty(charSequence) && i4 > length) {
                return spanned.subSequence(i3, i4);
            }
            if (i4 > length) {
                return "";
            }
            return null;
        }
    };

    /* renamed from: l */
    public boolean f166448l = false;

    /* renamed from: m */
    public int f166449m = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText$b */
    public interface AbstractC74124b {
        static {
            Covode.recordClassIndex(86878);
        }

        /* renamed from: a */
        void mo116531a(int i, int i2);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText
    public String getAdTag() {
        return this.f166443g;
    }

    public String getCreationId() {
        return this.f166424G;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3788aa.AbstractC69754b
    public int getHookAtMaxWidth() {
        return this.f166426I;
    }

    public AbstractC63199ax.AbstractC63200a getPublishExtensionDataContainer() {
        return this.f166445i;
    }

    public int getVideoType() {
        return this.f166427J;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText
    /* renamed from: a */
    public final void mo116501a(String str) {
        String str2 = "";
        if (this.f166444h != null && !TextUtils.isEmpty(this.f166433P)) {
            str2 = str2 + this.f166433P;
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = str2 + str;
        }
        if (!TextUtils.isEmpty(str2)) {
            setFixLengthInFront(str2);
        }
    }

    /* renamed from: a */
    public final void mo116502a(boolean z) {
        if (getText() != null) {
            System.currentTimeMillis();
            mo116540c();
            ArrayList<C74159r> arrayList = new ArrayList();
            String noAdTagText = getNoAdTagText();
            for (C80733a aVar : mo116503b(noAdTagText)) {
                arrayList.add(new C74159r(aVar.f180507a, aVar.f180508b));
            }
            ArrayList<C74159r> arrayList2 = new ArrayList(arrayList);
            if (this.f166476r != null && !this.f166476r.isEmpty()) {
                arrayList2.addAll(this.f166476r);
            }
            Collections.sort(arrayList2, C74148g.f166548a);
            int i = 0;
            StyleSpan[] styleSpanArr = (StyleSpan[]) getText().getSpans(0, getText().length(), StyleSpan.class);
            for (StyleSpan styleSpan : styleSpanArr) {
                if (styleSpan.getStyle() == 1) {
                    getText().removeSpan(styleSpan);
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (C74159r rVar : arrayList) {
                if (z || rVar.mo116632a(getSelectionStart() - 1, getSelectionEnd() - 1) || rVar.mo116632a(getSelectionStart() + 1, getSelectionEnd() + 1)) {
                    spannableStringBuilder.append((CharSequence) noAdTagText.substring(rVar.f166560a, rVar.f166561b));
                    boolean b = mo116505b(arrayList.indexOf(rVar));
                    MentionEditText.MentionSpan mentionSpan = new MentionEditText.MentionSpan(b ? this.f166473o : this.f166472n, spannableStringBuilder.toString(), "", 1, "", "");
                    mentionSpan.mo116580a(b);
                    m130320b(rVar.f166560a, rVar.f166561b);
                    getText().setSpan(mentionSpan, rVar.f166560a, rVar.f166561b, 33);
                    getText().setSpan(new StyleSpan(1), rVar.f166560a, rVar.f166561b, 33);
                    spannableStringBuilder.clear();
                }
            }
            int length = noAdTagText.length();
            for (C74159r rVar2 : arrayList2) {
                if (i >= 0 && rVar2.f166560a <= length && i <= rVar2.f166560a) {
                    m130320b(i, rVar2.f166560a);
                    getText().setSpan(new StyleSpan(1), rVar2.f166560a, rVar2.f166561b, 33);
                    i = rVar2.f166561b;
                }
            }
            if (i <= length) {
                m130320b(i, length);
            }
            Editable text = getText();
            if (text.length() != 0) {
                m130321b(text);
                m130323c(text);
            }
            mo116541d();
            C51423a.m95792b("MentionEditText", "full: " + z + "\n  text: " + getText().toString() + " and se: " + getSelectionEnd());
        }
    }

    static {
        Covode.recordClassIndex(86873);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText
    /* renamed from: a */
    public final void mo116495a() {
        C34408a aVar = this.f166444h;
        if (aVar != null) {
            m130322b(aVar);
        }
        if (this.f166429L != null) {
            this.f166429L = null;
        }
    }

    public int getCurAdTagStart() {
        return Math.max(getText().length() - this.f166443g.length(), 0);
    }

    public String getNoAdTagTextForTitleModule() {
        if (TextUtils.isEmpty(this.f166443g)) {
            return m130318a(getText());
        }
        removeHashTag();
        return m130318a(getText());
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText
    public String getNoAdTagText() {
        if (TextUtils.isEmpty(this.f166443g)) {
            return getText().toString();
        }
        return getText().toString().substring(0, getCurAdTagStart());
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText, com.p2082ss.android.ugc.aweme.services.publish.IAVMentionEditText
    public void removeHashTag() {
        if (!TextUtils.isEmpty(this.f166443g)) {
            m130322b(this.f166447k);
            this.f166431N = false;
            int curAdTagStart = getCurAdTagStart();
            this.f166443g = "";
            getText().replace(curAdTagStart, getText().length(), "");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText
    public List<TextExtraStruct> getCompatTextExtraStructList() {
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        MentionEditText.MentionSpan[] mentionText = getMentionText();
        for (MentionEditText.MentionSpan mentionSpan : mentionText) {
            if (mentionSpan.f166490c == 0 || mentionSpan.f166490c == 5) {
                mentionSpan.f166491d.setStart(text.getSpanStart(mentionSpan));
                mentionSpan.f166491d.setEnd(text.getSpanEnd(mentionSpan));
                arrayList.add(mentionSpan.f166491d);
            }
        }
        List<C80733a> b = mo116503b(getNoAdTagText());
        for (C80733a aVar : b) {
            TextExtraStruct textExtraStruct = new TextExtraStruct();
            textExtraStruct.setType(1);
            textExtraStruct.setStarAtlasTag(mo116505b(b.indexOf(aVar)));
            textExtraStruct.setHashTagName(aVar.f180509c.replaceAll("#", ""));
            textExtraStruct.setStart(aVar.f180507a);
            textExtraStruct.setEnd(aVar.f180508b);
            arrayList.add(textExtraStruct);
            if (TextUtils.equals(C63238c.f143594u.mo93904c(), null)) {
                C63238c.f143583j.saveLocalHashTag(true, textExtraStruct.getHashTagName());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo116504b() {
        if (!this.f166425H) {
            if (getVideoType() == 1) {
                C39162r.m79460a("caption_delete", new C84425b().mo129406a("creation_id", this.f166424G).mo129406a("caption_type", "duet").f188764a);
            } else if (getVideoType() == 2) {
                C39162r.m79460a("caption_delete", new C84425b().mo129406a("creation_id", this.f166424G).mo129406a("caption_type", "react").f188764a);
            } else if (getVideoType() == 3) {
                C39162r.m79460a("caption_delete", new C84425b().mo129406a("creation_id", this.f166424G).mo129406a("caption_type", "comment_reply").f188764a);
            }
            this.f166425H = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText
    /* renamed from: a */
    public final void mo116496a(int i) {
        setEmoticonFilter(i);
    }

    public void setChainString(String str) {
        this.f166433P = str;
    }

    public void setCreationId(String str) {
        this.f166424G = str;
    }

    public void setPublishExtensionDataContainer(AbstractC63199ax.AbstractC63200a aVar) {
        this.f166445i = aVar;
    }

    public void setVideoType(int i) {
        this.f166427J = i;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText$a */
    class C74123a implements TextWatcher {

        /* renamed from: a */
        boolean f166455a;

        /* renamed from: b */
        int f166456b;

        /* renamed from: c */
        int f166457c;

        /* renamed from: d */
        int f166458d;

        static {
            Covode.recordClassIndex(86877);
        }

        private C74123a() {
        }

        public final void afterTextChanged(Editable editable) {
            if (!HashTagMentionEditText.this.f166448l) {
                HashTagMentionEditText.this.mo116497a(editable, this.f166456b + this.f166457c);
            }
            HashTagMentionEditText.this.post(new RunnableC74155n(this));
        }

        /* synthetic */ C74123a(HashTagMentionEditText hashTagMentionEditText, byte b) {
            this();
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int length;
            Editable text = HashTagMentionEditText.this.getText();
            this.f166457c = i3;
            this.f166456b = i;
            this.f166458d = i2;
            if (text != null && !TextUtils.isEmpty(text.toString())) {
                List<TextExtraStruct> compatTextExtraStructList = HashTagMentionEditText.this.getCompatTextExtraStructList();
                int length2 = text.length();
                for (TextExtraStruct textExtraStruct : compatTextExtraStructList) {
                    if (textExtraStruct != null && textExtraStruct.getType() == 1 && textExtraStruct.getStart() <= length2 && textExtraStruct.getEnd() <= length2 && textExtraStruct.getStart() <= textExtraStruct.getEnd()) {
                        HashTagMentionEditText.this.mo116499a(textExtraStruct, text);
                    }
                }
            }
            HashTagMentionEditText hashTagMentionEditText = HashTagMentionEditText.this;
            int i4 = 0;
            if (!(hashTagMentionEditText.f166437a == 0 || hashTagMentionEditText.f166438b == null)) {
                Editable text2 = hashTagMentionEditText.getText();
                C69753a[] aVarArr = (C69753a[]) text2.getSpans(0, text2.length(), C69753a.class);
                if (aVarArr == null) {
                    length = 0;
                } else {
                    length = aVarArr.length;
                }
                if (hashTagMentionEditText.f166437a == 1 && length == 0) {
                    hashTagMentionEditText.mo116504b();
                }
                hashTagMentionEditText.f166437a = length;
            }
            HashTagMentionEditText hashTagMentionEditText2 = HashTagMentionEditText.this;
            if (!(hashTagMentionEditText2.f166440d == 0 || hashTagMentionEditText2.f166439c == null)) {
                Editable text3 = hashTagMentionEditText2.getText();
                C69755c[] cVarArr = (C69755c[]) text3.getSpans(0, text3.length(), C69755c.class);
                if (cVarArr != null) {
                    i4 = cVarArr.length;
                }
                if (hashTagMentionEditText2.f166440d == 1 && i4 == 0) {
                    hashTagMentionEditText2.mo116504b();
                }
                hashTagMentionEditText2.f166440d = i4;
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Object valueOf;
            Object valueOf2;
            if (i3 > 0) {
                this.f166455a = false;
                return;
            }
            int i4 = 1;
            this.f166455a = true;
            HashTagMentionEditText hashTagMentionEditText = HashTagMentionEditText.this;
            int i5 = i + i2;
            if (hashTagMentionEditText.f166445i != null) {
                String noAdTagText = hashTagMentionEditText.getNoAdTagText();
                if (i < i5 && i >= 0 && !TextUtils.isEmpty(noAdTagText) && noAdTagText.length() > 0) {
                    AbstractC32846a e = C63238c.f143594u.mo93906e();
                    String substring = noAdTagText.substring(i, i5);
                    Mission a = C63238c.f143585l.mo93813a(hashTagMentionEditText.f166445i.mo101676a());
                    String str = "0";
                    if (!a.isChallengeToasted() && a.getChallengeNames() != null && !a.getChallengeNames().isEmpty()) {
                        boolean z = false;
                        for (String str2 : a.getChallengeNames()) {
                            if (substring.length() > i4 && TextUtils.equals(String.valueOf(substring.charAt(substring.length() - i4)), hashTagMentionEditText.getContext().getString(R.string.fzs))) {
                                z = TextUtils.equals(hashTagMentionEditText.mo116506c(noAdTagText.substring(0, i5 - 1)), "#".concat(String.valueOf(str2)));
                            }
                            if (TextUtils.equals(substring, "#".concat(String.valueOf(str2))) || z) {
                                a.setChallengeToasted(true);
                                C84425b a2 = new C84425b().mo129403a("value", 3).mo129406a("mission_id", a.getMissionId()).mo129406a("page_source", a.getEnterFrom());
                                if (e == null) {
                                    valueOf2 = str;
                                } else {
                                    valueOf2 = Integer.valueOf(e.mo58670m());
                                }
                                C84425b a3 = a2.mo129405a("creator_followers", valueOf2);
                                if (!C63253l.f143623a.mo73330z().mo93832j()) {
                                    str = "1";
                                }
                                C39162r.m79460a("mission_requirement_modified", a3.mo129406a("creator_type", str).f188764a);
                                hashTagMentionEditText.f166445i.mo101679a(C63238c.f143585l.mo93816a(hashTagMentionEditText.f166445i.mo101676a(), a));
                                return;
                            }
                            i4 = 1;
                        }
                    }
                    if (!(a.isUserToasted() || a.getMentionedUsers() == null || a.getMentionedUsers().isEmpty())) {
                        Iterator<MissionUser> it = a.getMentionedUsers().iterator();
                        while (it.hasNext()) {
                            if (TextUtils.equals(substring, "@" + it.next().getNickname())) {
                                a.setUserToasted(true);
                                C84425b a4 = new C84425b().mo129403a("value", 2).mo129406a("mission_id", a.getMissionId()).mo129406a("page_source", a.getEnterFrom());
                                if (e == null) {
                                    valueOf = str;
                                } else {
                                    valueOf = Integer.valueOf(e.mo58670m());
                                }
                                C84425b a5 = a4.mo129405a("creator_followers", valueOf);
                                if (!C63253l.f143623a.mo73330z().mo93832j()) {
                                    str = "1";
                                }
                                C39162r.m79460a("mission_requirement_modified", a5.mo129406a("creator_type", str).f188764a);
                                hashTagMentionEditText.f166445i.mo101679a(C63238c.f143585l.mo93816a(hashTagMentionEditText.f166445i.mo101676a(), a));
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    public void setAVTextExtraList(List<AVTextExtraStruct> list) {
        setTextExtraList(C69805f.m123335a(list));
    }

    /* renamed from: b */
    private void m130321b(Editable editable) {
        if (!m130324d(editable)) {
            editable.removeSpan(this.f166438b);
            this.f166438b = null;
            mo116504b();
        }
    }

    /* renamed from: c */
    private void m130323c(Editable editable) {
        if (!m130325e(editable)) {
            editable.removeSpan(this.f166439c);
            this.f166439c = null;
            mo116504b();
        }
    }

    /* renamed from: a */
    public final void mo116498a(InputFilter inputFilter) {
        if (this.f166428K == null) {
            this.f166428K = new ArrayList();
        }
        this.f166428K.add(inputFilter);
        setFilters((InputFilter[]) this.f166428K.toArray(new InputFilter[0]));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f166436S = false;
        }
        if (this.f166436S) {
            motionEvent.setAction(3);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.f166436S) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return onTouchEvent;
    }

    public void setEmoticonFilter(int i) {
        InputFilter inputFilter = this.f166434Q;
        if (inputFilter != null) {
            m130322b(inputFilter);
        }
        C73966as.f166053a = i;
        C34410b bVar = new C34410b(C73966as.m130092a(), this);
        this.f166434Q = bVar;
        mo116498a(bVar);
    }

    /* renamed from: d */
    private boolean m130324d(Editable editable) {
        if (this.f166438b == null) {
            return false;
        }
        for (MentionEditText.MentionSpan mentionSpan : (MentionEditText.MentionSpan[]) editable.getSpans(0, editable.length(), MentionEditText.MentionSpan.class)) {
            if (!TextUtils.isEmpty(mentionSpan.f166492e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private boolean m130325e(Editable editable) {
        if (this.f166439c == null) {
            return false;
        }
        for (MentionEditText.MentionSpan mentionSpan : (MentionEditText.MentionSpan[]) editable.getSpans(0, editable.length(), MentionEditText.MentionSpan.class)) {
            if (mentionSpan.f166493f == 2) {
                return true;
            }
        }
        return false;
    }

    public void setFixLengthInFront(String str) {
        int length;
        InputFilter inputFilter = this.f166444h;
        if (inputFilter != null) {
            m130322b(inputFilter);
        }
        if (!TextUtils.isEmpty(str) && length() >= (length = str.length())) {
            C34408a aVar = new C34408a(new C74149h(this), this, length);
            this.f166444h = aVar;
            mo116498a(aVar);
            this.f166429L = new AbstractC74124b(length) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText.C741223 */

                /* renamed from: a */
                int f166452a;

                /* renamed from: b */
                final /* synthetic */ int f166453b;

                static {
                    Covode.recordClassIndex(86876);
                }

                {
                    this.f166453b = r2;
                    this.f166452a = r2;
                }

                @Override // com.p2082ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText.AbstractC74124b
                /* renamed from: a */
                public final void mo116531a(int i, int i2) {
                    if (i != 0 || i2 != HashTagMentionEditText.this.length()) {
                        if (i < this.f166453b) {
                            HashTagMentionEditText.this.setSelection(this.f166452a);
                        } else {
                            this.f166452a = i;
                        }
                    }
                }
            };
        }
    }

    /* renamed from: a */
    private static String m130318a(Editable editable) {
        StringBuilder sb = new StringBuilder(editable.toString());
        C74156o[] oVarArr = (C74156o[]) editable.getSpans(0, editable.length(), C74156o.class);
        if (oVarArr.length > 0) {
            int length = oVarArr.length;
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = editable.getSpanStart(oVarArr[i]);
            }
            Arrays.sort(iArr);
            for (int i2 = length - 1; i2 >= 0; i2--) {
                sb.delete(iArr[i2], iArr[i2] + 1);
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    private void m130322b(InputFilter inputFilter) {
        List<InputFilter> list = this.f166428K;
        if (list != null) {
            list.remove(inputFilter);
            setFilters((InputFilter[]) this.f166428K.toArray(new InputFilter[0]));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText, com.p2082ss.android.ugc.aweme.services.publish.IAVMentionEditText
    public void addHashTag(String str) {
        if (TextUtils.isEmpty(this.f166443g)) {
            this.f166443g = " ".concat(String.valueOf(str));
            getText().insert(Math.max(getSelectionEnd(), getText().length()), this.f166443g);
            getText().setSpan(new MentionEditText.AdSpan(C0643b.m2378c(getContext(), R.color.c5)), getCurAdTagStart(), getText().length(), 33);
            mo116498a(this.f166447k);
            this.f166431N = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo116506c(String str) {
        int length = str.length();
        if (!TextUtils.isEmpty(str)) {
            int i = length - 1;
            int length2 = str.length();
            while (i >= 0) {
                char charAt = str.charAt(i);
                if (charAt != ' ' && !String.valueOf(charAt).equals(getContext().getString(R.string.fzs)) && charAt != '@' && charAt != '\n') {
                    if (charAt == '#') {
                        break;
                    }
                    i--;
                } else {
                    return "";
                }
            }
            while (length < length2) {
                char charAt2 = str.charAt(length);
                if (charAt2 == '#' || charAt2 == ' ' || String.valueOf(charAt2).equals(getContext().getString(R.string.fzs)) || charAt2 == '@' || charAt2 == '\n') {
                    break;
                }
                length++;
            }
            if (i >= 0 && length <= length2 && i < length) {
                return str.substring(i, length);
            }
        }
        return "";
    }

    /* renamed from: b */
    public final List<C80733a> mo116503b(String str) {
        int indexOf;
        boolean z;
        HashSet hashSet = new HashSet();
        int i = 0;
        for (String str2 : C80345dj.m139306a(str, C80345dj.m139305a())) {
            int indexOf2 = str.indexOf(str2, i);
            if (indexOf2 >= 0) {
                Iterator it = this.f166462C.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (indexOf2 == str.indexOf((String) it.next(), i)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                i = str2.length() + indexOf2;
                if (!z) {
                    hashSet.add(new C80733a(str2, indexOf2, i));
                }
            }
        }
        for (String str3 : this.f166462C) {
            int i2 = 0;
            while (i2 < str.length() && (indexOf = str.indexOf(str3, i2)) >= 0) {
                i2 = str3.length() + indexOf;
                hashSet.add(new C80733a(str3, indexOf, i2));
            }
        }
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList, new C80733a.C80734a());
        return arrayList;
    }

    /* renamed from: f */
    private void m130326f(Editable editable) {
        String substring;
        MentionEditText.MentionSpan[] mentionSpanArr;
        boolean z;
        int i;
        if (editable != null) {
            System.currentTimeMillis();
            ArrayList<C74159r> arrayList = new ArrayList();
            if (TextUtils.isEmpty(this.f166443g)) {
                substring = editable.toString();
            } else {
                substring = editable.toString().substring(0, getCurAdTagStart());
            }
            for (C80733a aVar : mo116503b(substring)) {
                arrayList.add(new C74159r(aVar.f180507a, aVar.f180508b));
            }
            ArrayList<C74159r> arrayList2 = new ArrayList(arrayList);
            if (this.f166476r != null && !this.f166476r.isEmpty()) {
                arrayList2.addAll(this.f166476r);
            }
            Collections.sort(arrayList2, C74148g.f166548a);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (C74159r rVar : arrayList) {
                if (rVar.mo116632a(getSelectionStart() - 1, getSelectionEnd() - 1) || rVar.mo116632a(getSelectionStart() + 1, getSelectionEnd() + 1)) {
                    spannableStringBuilder.append((CharSequence) substring.substring(rVar.f166560a, rVar.f166561b));
                    int indexOf = arrayList.indexOf(rVar);
                    if (TextUtils.isEmpty(editable.toString())) {
                        mentionSpanArr = null;
                    } else {
                        mentionSpanArr = (MentionEditText.MentionSpan[]) editable.getSpans(0, getNoAdTagText().length(), MentionEditText.MentionSpan.class);
                        Arrays.sort(mentionSpanArr, new C74154m(editable));
                    }
                    if (indexOf < 0 || indexOf >= mentionSpanArr.length) {
                        z = false;
                        i = this.f166472n;
                    } else {
                        z = mentionSpanArr[indexOf].f166491d.isStarAtlasTag();
                        if (z) {
                            i = this.f166473o;
                        }
                        i = this.f166472n;
                    }
                    MentionEditText.MentionSpan mentionSpan = new MentionEditText.MentionSpan(i, spannableStringBuilder.toString(), "", 1, "", "");
                    mentionSpan.mo116580a(z);
                    m130319a(editable, rVar.f166560a, rVar.f166561b, false);
                    editable.setSpan(mentionSpan, rVar.f166560a, rVar.f166561b, 33);
                    editable.setSpan(new StyleSpan(1), rVar.f166560a, rVar.f166561b, 33);
                    spannableStringBuilder.clear();
                }
            }
            int length = substring.length();
            int i2 = 0;
            for (C74159r rVar2 : arrayList2) {
                if (i2 >= 0 && rVar2.f166560a <= length && i2 <= rVar2.f166560a) {
                    m130319a(editable, i2, rVar2.f166560a, false);
                    i2 = rVar2.f166561b;
                }
            }
            if (i2 <= length) {
                m130319a(editable, i2, length, false);
            }
            if (editable.length() != 0) {
                m130321b(editable);
                m130323c(editable);
            }
            C51423a.m95792b("MentionEditText", "full: \n  text: " + getText().toString() + " and se: " + getSelectionEnd());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText
    public void setTextExtraList(List<TextExtraStruct> list) {
        MethodCollector.m26663i(11120);
        super.setTextExtraList(list);
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(getNoAdTagText())) {
            MethodCollector.m26664o(11120);
            return;
        }
        int length = getNoAdTagText().length();
        if (C13603b.m24435a((Collection) list)) {
            MethodCollector.m26664o(11120);
            return;
        }
        for (TextExtraStruct textExtraStruct : list) {
            if (textExtraStruct != null) {
                if (textExtraStruct.getType() == 1) {
                    if (textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd()) {
                        mo116499a(textExtraStruct, text);
                    }
                }
                if (((textExtraStruct.getType() == 0 && !TextUtils.isEmpty(textExtraStruct.getAwemeId())) || (textExtraStruct.getType() == 5 && !TextUtils.isEmpty(textExtraStruct.getAwemeId()))) && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd()) {
                    if (textExtraStruct.getEnd() < length && text.charAt(textExtraStruct.getEnd()) == 160) {
                        text.replace(textExtraStruct.getEnd(), textExtraStruct.getEnd() + 1, " ");
                    }
                    if (textExtraStruct.getSubtype() == 1 || textExtraStruct.getSubtype() == 6) {
                        C69753a aVar = new C69753a(getContext(), this);
                        this.f166438b = aVar;
                        text.setSpan(aVar, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                        this.f166437a++;
                    }
                    if (textExtraStruct.getSubtype() == 2) {
                        C69755c cVar = new C69755c(getContext(), this);
                        this.f166439c = cVar;
                        cVar.f155895a = BitmapFactory.decodeResource(getContext().getResources(), 2131233962);
                        text.setSpan(this.f166439c, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                        this.f166440d = 1;
                    }
                }
            }
        }
        MethodCollector.m26664o(11120);
    }

    /* renamed from: b */
    public final boolean mo116505b(int i) {
        MentionEditText.MentionSpan[] mentionText = getMentionText();
        if (i < 0 || i >= mentionText.length) {
            return false;
        }
        return mentionText[i].f166491d.isStarAtlasTag();
    }

    /* renamed from: b */
    private void m130320b(int i, int i2) {
        if (i < i2 && getText() != null) {
            for (MentionEditText.MentionSpan mentionSpan : (MentionEditText.MentionSpan[]) getText().getSpans(i, i2, MentionEditText.MentionSpan.class)) {
                getText().removeSpan(mentionSpan);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f166426I = View.MeasureSpec.getSize(i);
        super.onMeasure(i, i2);
        int height = getLayout().getHeight();
        int totalPaddingTop = getTotalPaddingTop();
        this.f166435R = ((height + totalPaddingTop) + getTotalPaddingBottom()) - getHeight();
    }

    public HashTagMentionEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!C63238c.f143594u.mo93901a()) {
            C74123a aVar = new C74123a(this, (byte) 0);
            this.f166432O = aVar;
            addTextChangedListener(aVar);
            setOnFocusChangeListener(this.f166446j);
        }
    }

    /* renamed from: a */
    public final void mo116497a(Editable editable, int i) {
        boolean z;
        mo116540c();
        if (!C63253l.f143623a.mo73309e().mo93762d() && i > 0 && editable.charAt(i - 1) == '\n') {
            i--;
        }
        C74156o[] oVarArr = (C74156o[]) editable.getSpans(0, editable.length(), C74156o.class);
        if (oVarArr.length > 0) {
            int length = oVarArr.length;
            int[] iArr = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = editable.getSpanStart(oVarArr[i2]);
            }
            Arrays.sort(iArr);
            for (int i3 = length - 1; i3 >= 0; i3--) {
                editable.delete(iArr[i3], iArr[i3] + 1);
                if (i >= iArr[i3]) {
                    i--;
                }
            }
            z = true;
        } else {
            z = false;
        }
        String obj = editable.toString();
        LinkedHashMap<String, Bitmap> d = AVCommerceServiceImpl.m102988h().mo93967d();
        while (obj.length() > 1) {
            String c = mo116506c(obj);
            if (c.isEmpty()) {
                obj = obj.substring(0, obj.length() - 1);
            } else {
                String lowerCase = c.toLowerCase();
                if (d != null && d.containsKey(lowerCase.substring(1))) {
                    Bitmap bitmap = d.get(lowerCase.substring(1));
                    if (bitmap != null) {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                        bitmapDrawable.setBounds(0, 0, (int) getTextSize(), (int) getTextSize());
                        C74156o oVar = new C74156o(bitmapDrawable);
                        editable.insert(obj.length(), getContext().getString(R.string.fzs));
                        if (editable.length() >= obj.length() + 1) {
                            editable.setSpan(oVar, obj.length(), obj.length() + 1, 33);
                        }
                    }
                    if (i > obj.length()) {
                        i++;
                    }
                    z = true;
                }
                obj = obj.substring(0, obj.length() - c.length());
            }
        }
        if (z) {
            m130326f(editable);
        }
        mo116541d();
        if (z) {
            this.f166448l = true;
            this.f166449m = i;
            setCursorVisible(false);
            C34408a aVar = this.f166444h;
            if (aVar != null) {
                m130322b(aVar);
            }
            if (this.f166431N.booleanValue()) {
                m130322b(this.f166447k);
            }
            setText(editable);
            if (i >= editable.length()) {
                i = editable.length();
            }
            if (this.f166444h != null) {
                post(new RunnableC74150i(this));
            }
            if (this.f166431N.booleanValue()) {
                post(new RunnableC74151j(this));
            }
            post(new RunnableC74152k(this, i, editable));
            post(new RunnableC74153l(this));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText
    public void onSelectionChanged(int i, int i2) {
        Object valueOf;
        Object valueOf2;
        super.onSelectionChanged(i, i2);
        if (!this.f166477s) {
            AbstractC74124b bVar = this.f166429L;
            if (bVar != null) {
                bVar.mo116531a(i, i2);
            }
            if (getText() != null && i >= 0 && i2 >= 0 && i < i2) {
                String charSequence = getText().subSequence(i, i2).toString();
                AbstractC32846a e = C63238c.f143594u.mo93906e();
                if (this.f166445i != null) {
                    Mission a = C63238c.f143585l.mo93813a(this.f166445i.mo101676a());
                    String str = "0";
                    if (!a.isChallengeToasted() && a.getChallengeNames() != null && !a.getChallengeNames().isEmpty()) {
                        boolean z = false;
                        for (String str2 : a.getChallengeNames()) {
                            if (charSequence.length() > 1 && TextUtils.equals(String.valueOf(charSequence.charAt(charSequence.length() - 1)), getContext().getString(R.string.fzs))) {
                                z = TextUtils.equals(mo116506c(getNoAdTagText().substring(0, i2 - 1)), "#".concat(String.valueOf(str2)));
                            }
                            if (!TextUtils.equals(charSequence, "#".concat(String.valueOf(str2)))) {
                                if (z) {
                                }
                            }
                            new C79459a(C40963b.m82473a()).mo123050a(R.string.d3q).mo123053a();
                            C84425b a2 = new C84425b().mo129403a("reason", 3).mo129406a("mission_id", a.getMissionId()).mo129406a("page_source", a.getEnterFrom());
                            if (e == null) {
                                valueOf2 = str;
                            } else {
                                valueOf2 = Integer.valueOf(e.mo58670m());
                            }
                            C84425b a3 = a2.mo129405a("creator_followers", valueOf2);
                            if (!C63253l.f143623a.mo73330z().mo93832j()) {
                                str = "1";
                            }
                            C39162r.m79460a("mission_requirement_toast", a3.mo129406a("creator_type", str).f188764a);
                            return;
                        }
                    }
                    if (!(a.isUserToasted() || a.getMentionedUsers() == null || a.getMentionedUsers().isEmpty())) {
                        for (MissionUser missionUser : a.getMentionedUsers()) {
                            if (charSequence.contains(missionUser.getNickname())) {
                                new C79459a(C40963b.m82473a()).mo123050a(R.string.d3o).mo123053a();
                                C84425b a4 = new C84425b().mo129403a("reason", 2).mo129406a("mission_id", a.getMissionId()).mo129406a("page_source", a.getEnterFrom());
                                if (e == null) {
                                    valueOf = str;
                                } else {
                                    valueOf = Integer.valueOf(e.mo58670m());
                                }
                                C84425b a5 = a4.mo129405a("creator_followers", valueOf);
                                if (!C63253l.f143623a.mo73330z().mo93832j()) {
                                    str = "1";
                                }
                                C39162r.m79460a("mission_requirement_toast", a5.mo129406a("creator_type", str).f188764a);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo116499a(com.p2082ss.android.ugc.aweme.model.TextExtraStruct r13, android.text.Editable r14) {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText.mo116499a(com.ss.android.ugc.aweme.model.TextExtraStruct, android.text.Editable):void");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText
    /* renamed from: a */
    public final void mo116500a(MentionEditText.MentionSpan mentionSpan, C74159r rVar) {
        if (AVCommerceServiceImpl.m102988h().mo93959a(mentionSpan.f166489b) != null && getNoAdTagText().length() > rVar.f166561b && String.valueOf(getNoAdTagText().charAt(rVar.f166561b)).equals(getContext().getString(R.string.fzs))) {
            this.f166476r.add(new C74159r(rVar.f166561b - 1, rVar.f166561b + 1));
        }
        if (!TextUtils.isEmpty(mentionSpan.f166489b) && !this.f166430M.contains(mentionSpan.f166489b) && this.f166462C.contains(mentionSpan.f166489b)) {
            this.f166476r.add(rVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (i2 == this.f166435R || i2 == 0) {
            getParent().requestDisallowInterceptTouchEvent(false);
            this.f166436S = true;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String charSequence2;
        super.onTextChanged(charSequence, i, i2, i3);
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        for (String str : this.f166462C) {
            if (!charSequence2.contains(str)) {
                this.f166430M.add(str);
            }
        }
    }

    /* renamed from: a */
    private static void m130319a(Editable editable, int i, int i2, boolean z) {
        if (i < i2 && editable != null) {
            MentionEditText.MentionSpan[] mentionSpanArr = (MentionEditText.MentionSpan[]) editable.getSpans(i, i2, MentionEditText.MentionSpan.class);
            for (MentionEditText.MentionSpan mentionSpan : mentionSpanArr) {
                if (editable.getSpanEnd(mentionSpan) < editable.length() && editable.getSpanStart(mentionSpan) >= 0) {
                    if (z) {
                        ALog.m59865d("MentionEditText", "oldSpan: " + mentionSpan.f166489b + " oldSpan.start:" + editable.getSpanStart(mentionSpan) + " oldSpan.end:" + editable.getSpanEnd(mentionSpan) + "\n editable: " + editable.toString() + " editable.length: " + editable.length());
                    }
                    editable.removeSpan(mentionSpan);
                }
            }
        }
    }
}

package com.bytedance.p1777x;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1777x.p1778a.C23679a;
import com.bytedance.p1777x.p1778a.C23680b;
import com.bytedance.p1777x.p1779b.C23682a;
import com.bytedance.p1777x.p1779b.C23683b;
import com.bytedance.p1777x.p1779b.C23684c;
import com.bytedance.p1777x.p1779b.C23685d;
import com.bytedance.p1777x.p1779b.C23686e;
import com.bytedance.p1777x.p1779b.C23687f;
import com.bytedance.p1777x.p1779b.C23688g;
import com.bytedance.p1777x.p1780c.C23690a;
import com.bytedance.p1777x.p1780c.C23691b;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.AbstractC89306h;
import p4600h.p4621l.C89309k;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.x.d */
public final class C23698d {

    /* renamed from: a */
    private final XPath f56052a;

    /* renamed from: b */
    private int f56053b;

    /* renamed from: c */
    private final C23687f f56054c;

    /* renamed from: d */
    private final AbstractC23681b f56055d;

    /* renamed from: e */
    private final AbstractC23689c f56056e;

    static {
        Covode.recordClassIndex(27800);
    }

    public C23698d(C23687f fVar) {
        this(fVar, (AbstractC23681b) null, 6);
    }

    public C23698d(C23687f fVar, AbstractC23681b bVar) {
        this(fVar, bVar, 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.x.d$d */
    public static final /* synthetic */ class C23702d extends C89217j implements AbstractC89172b<Node, C23688g> {
        static {
            Covode.recordClassIndex(27804);
        }

        C23702d(C23698d dVar) {
            super(1, dVar, C23698d.class, "parseVideoClick", "parseVideoClick(Lorg/w3c/dom/Node;)Lcom/bytedance/vast/model/VideoClick;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C23688g invoke(Node node) {
            Node node2 = node;
            C89219l.m154721d(node2, "");
            return ((C23698d) this.receiver).mo39120a(node2);
        }
    }

    /* renamed from: b */
    private final void m44786b(Node node) {
        m44788c(node);
        m44790d(node);
        m44792e(node);
        m44793f(node);
    }

    /* renamed from: c */
    private final void m44788c(Node node) {
        XPath xPath = this.f56052a;
        C89219l.m154716b(xPath, "");
        AbstractC89306h<Node> a = C23691b.m44778a(xPath, node, "./Error");
        XPath xPath2 = this.f56052a;
        C89219l.m154716b(xPath2, "");
        Iterator<String> a2 = C23691b.m44776a(a, xPath2).mo2926a();
        while (a2.hasNext()) {
            String next = a2.next();
            C23687f fVar = this.f56054c;
            fVar.errorSet = C23690a.m44775a(fVar.errorSet, next);
        }
    }

    /* renamed from: d */
    private final void m44790d(Node node) {
        XPath xPath = this.f56052a;
        C89219l.m154716b(xPath, "");
        AbstractC89306h<Node> a = C23691b.m44778a(xPath, node, "./Impression");
        XPath xPath2 = this.f56052a;
        C89219l.m154716b(xPath2, "");
        Iterator<String> a2 = C23691b.m44776a(a, xPath2).mo2926a();
        while (a2.hasNext()) {
            String next = a2.next();
            C23687f fVar = this.f56054c;
            fVar.impressionSet = C23690a.m44775a(fVar.impressionSet, next);
        }
    }

    /* renamed from: e */
    private final void m44792e(Node node) {
        XPath xPath = this.f56052a;
        C89219l.m154716b(xPath, "");
        Iterator<Node> a = C23691b.m44778a(xPath, node, "./AdVerifications/Verification", "./Extension[@type='AdVerifications']/AdVerifications/Verification", "./Extensions/Extension[@type='AdVerifications']/AdVerifications/Verification").mo2926a();
        while (a.hasNext()) {
            Node next = a.next();
            C23682a aVar = new C23682a();
            String evaluate = this.f56052a.evaluate("./@vendor", next);
            C89219l.m154716b(evaluate, "");
            Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.CharSequence");
            aVar.vender = C89361p.m154910b((CharSequence) evaluate).toString();
            String evaluate2 = this.f56052a.evaluate("./JavaScriptResource/text()", next);
            C89219l.m154716b(evaluate2, "");
            Objects.requireNonNull(evaluate2, "null cannot be cast to non-null type kotlin.CharSequence");
            aVar.javascriptResource = C89361p.m154910b((CharSequence) evaluate2).toString();
            String evaluate3 = this.f56052a.evaluate("./VerificationParameters/text()", next);
            C89219l.m154716b(evaluate3, "");
            Objects.requireNonNull(evaluate3, "null cannot be cast to non-null type kotlin.CharSequence");
            aVar.verificationParameters = C89361p.m154910b((CharSequence) evaluate3).toString();
            C23687f fVar = this.f56054c;
            fVar.adVerificationList = C23690a.m44774a(fVar.adVerificationList, aVar);
        }
    }

    /* renamed from: f */
    private final void m44793f(Node node) {
        XPath xPath = this.f56052a;
        C89219l.m154716b(xPath, "");
        Iterator<Node> a = C23691b.m44778a(xPath, node, "./ViewableImpression").mo2926a();
        while (a.hasNext()) {
            Node next = a.next();
            XPath xPath2 = this.f56052a;
            C89219l.m154716b(xPath2, "");
            AbstractC89306h<Node> a2 = C23691b.m44778a(xPath2, next, "./Viewable");
            XPath xPath3 = this.f56052a;
            C89219l.m154716b(xPath3, "");
            Iterator<String> a3 = C23691b.m44776a(a2, xPath3).mo2926a();
            while (a3.hasNext()) {
                String next2 = a3.next();
                C23687f fVar = this.f56054c;
                fVar.viewableSet = C23690a.m44775a(fVar.viewableSet, next2);
            }
            XPath xPath4 = this.f56052a;
            C89219l.m154716b(xPath4, "");
            AbstractC89306h<Node> a4 = C23691b.m44778a(xPath4, next, "./NotViewable");
            XPath xPath5 = this.f56052a;
            C89219l.m154716b(xPath5, "");
            Iterator<String> a5 = C23691b.m44776a(a4, xPath5).mo2926a();
            while (a5.hasNext()) {
                String next3 = a5.next();
                C23687f fVar2 = this.f56054c;
                fVar2.notViewableSet = C23690a.m44775a(fVar2.notViewableSet, next3);
            }
            XPath xPath6 = this.f56052a;
            C89219l.m154716b(xPath6, "");
            AbstractC89306h<Node> a6 = C23691b.m44778a(xPath6, next, "./ViewUndetermined");
            XPath xPath7 = this.f56052a;
            C89219l.m154716b(xPath7, "");
            Iterator<String> a7 = C23691b.m44776a(a6, xPath7).mo2926a();
            while (a7.hasNext()) {
                String next4 = a7.next();
                C23687f fVar3 = this.f56054c;
                fVar3.viewUndeterminedSet = C23690a.m44775a(fVar3.viewUndeterminedSet, next4);
            }
        }
    }

    /* renamed from: a */
    public final C23688g mo39120a(Node node) {
        C23688g gVar = new C23688g();
        XPath xPath = this.f56052a;
        C89219l.m154716b(xPath, "");
        AbstractC89306h a = C89309k.m154796a("./ClickThrough", "./IconClickThrough");
        C89219l.m154721d(xPath, "");
        C89219l.m154721d(node, "");
        C89219l.m154721d(a, "");
        gVar.clickThrough = (String) C89309k.m154808d(C23691b.m44776a(C23691b.m44777a(xPath, node, a), xPath));
        XPath xPath2 = this.f56052a;
        C89219l.m154716b(xPath2, "");
        AbstractC89306h<Node> a2 = C23691b.m44777a(xPath2, node, C89309k.m154796a("./ClickTracking", "./IconClickTracking"));
        XPath xPath3 = this.f56052a;
        C89219l.m154716b(xPath3, "");
        Iterator<String> a3 = C23691b.m44776a(a2, xPath3).mo2926a();
        while (a3.hasNext()) {
            gVar.clickTracking = C23690a.m44775a(gVar.clickTracking, a3.next());
        }
        return gVar;
    }

    /* renamed from: com.bytedance.x.d$a */
    public static final class C23699a<T> implements Comparator {
        static {
            Covode.recordClassIndex(27801);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Integer.valueOf(t.byWrapper ? 1 : 0), Integer.valueOf(t2.byWrapper ? 1 : 0));
        }
    }

    /* renamed from: com.bytedance.x.d$b */
    public static final class C23700b<T> implements Comparator {
        static {
            Covode.recordClassIndex(27802);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Integer.valueOf(t.byWrapper ? 1 : 0), Integer.valueOf(t2.byWrapper ? 1 : 0));
        }
    }

    /* renamed from: com.bytedance.x.d$c */
    public static final class C23701c<T> implements Comparator {
        static {
            Covode.recordClassIndex(27803);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Integer.valueOf(t.byWrapper ? 1 : 0), Integer.valueOf(t2.byWrapper ? 1 : 0));
        }
    }

    /* renamed from: com.bytedance.x.d$e */
    public static final class C23703e<T> implements Comparator {
        static {
            Covode.recordClassIndex(27805);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Integer.valueOf(t.byWrapper ? 1 : 0), Integer.valueOf(t2.byWrapper ? 1 : 0));
        }
    }

    /* renamed from: com.bytedance.x.d$f */
    public static final class C23704f<T> implements Comparator {
        static {
            Covode.recordClassIndex(27806);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Integer.valueOf(t.byWrapper ? 1 : 0), Integer.valueOf(t2.byWrapper ? 1 : 0));
        }
    }

    /* renamed from: com.bytedance.x.d$g */
    public static final class C23705g<T> implements Comparator {
        static {
            Covode.recordClassIndex(27807);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Integer.valueOf(t.byWrapper ? 1 : 0), Integer.valueOf(t2.byWrapper ? 1 : 0));
        }
    }

    /* renamed from: b */
    private final void m44787b(Node node, C23683b bVar) {
        XPath xPath = this.f56052a;
        C89219l.m154716b(xPath, "");
        Iterator a = C89309k.m154810e(C23691b.m44778a(xPath, node, "./Linear/VideoClicks"), new C23702d(this)).mo2926a();
        while (a.hasNext()) {
            bVar.clickList = C23690a.m44774a(bVar.clickList, a.next());
        }
    }

    /* renamed from: a */
    private final void m44782a(Node node, C23683b bVar) {
        XPath xPath = this.f56052a;
        C89219l.m154716b(xPath, "");
        Iterator<Node> a = C23691b.m44778a(xPath, node, "./Linear/TrackingEvents/Tracking").mo2926a();
        while (a.hasNext()) {
            Node next = a.next();
            C23686e eVar = new C23686e();
            String evaluate = this.f56052a.evaluate("./@event", next);
            C89219l.m154716b(evaluate, "");
            Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.CharSequence");
            eVar.name = C89361p.m154910b((CharSequence) evaluate).toString();
            String evaluate2 = this.f56052a.evaluate("./@offset", next);
            C89219l.m154716b(evaluate2, "");
            Objects.requireNonNull(evaluate2, "null cannot be cast to non-null type kotlin.CharSequence");
            eVar.offset = C89361p.m154910b((CharSequence) evaluate2).toString();
            String evaluate3 = this.f56052a.evaluate("./text()", next);
            C89219l.m154716b(evaluate3, "");
            Objects.requireNonNull(evaluate3, "null cannot be cast to non-null type kotlin.CharSequence");
            eVar.url = C89361p.m154910b((CharSequence) evaluate3).toString();
            bVar.trackingEventList = C23690a.m44774a(bVar.trackingEventList, eVar);
        }
    }

    /* renamed from: a */
    private final void m44783a(Node node, boolean z) {
        XPath xPath = this.f56052a;
        C89219l.m154716b(xPath, "");
        Iterator<Node> a = C23691b.m44778a(xPath, node, "./Creatives/Creative").mo2926a();
        while (a.hasNext()) {
            Node next = a.next();
            C23683b bVar = new C23683b();
            bVar.byWrapper = z;
            String evaluate = this.f56052a.evaluate("./@id", next);
            C89219l.m154716b(evaluate, "");
            Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.CharSequence");
            bVar.f56044id = C89361p.m154910b((CharSequence) evaluate).toString();
            XPath xPath2 = this.f56052a;
            C89219l.m154716b(xPath2, "");
            C89219l.m154721d(xPath2, "");
            C89219l.m154721d(next, "");
            C89219l.m154721d("./Linear/Duration", "");
            bVar.duration = (String) C89309k.m154808d(C23691b.m44776a(C23691b.m44778a(xPath2, next, "./Linear/Duration"), xPath2));
            m44782a(next, bVar);
            m44787b(next, bVar);
            m44789c(next, bVar);
            m44791d(next, bVar);
            if (z) {
                C23687f fVar = this.f56054c;
                List<C23683b> list = fVar.creativeList;
                if (list == null) {
                    list = new LinkedList<>();
                }
                list.add(0, bVar);
                fVar.creativeList = list;
            } else {
                C23687f fVar2 = this.f56054c;
                fVar2.creativeList = C23690a.m44774a(fVar2.creativeList, bVar);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo39122b(String str, int i) {
        List<C23683b> list;
        List<C23683b> list2;
        List<C23683b> list3;
        AbstractC23689c cVar = this.f56056e;
        if (cVar != null) {
            cVar.mo39116b();
        }
        this.f56053b++;
        Document document = null;
        if (str != null) {
            try {
                document = C23691b.m44780b(str);
            } catch (C23680b e) {
                AbstractC23689c cVar2 = this.f56056e;
                if (cVar2 != null) {
                    cVar2.mo39115a(e);
                }
            } catch (Throwable th) {
                AbstractC23689c cVar3 = this.f56056e;
                if (cVar3 != null) {
                    cVar3.mo39119e();
                }
                int i2 = this.f56053b - 1;
                this.f56053b = i2;
                if (i2 == 0 && (list3 = this.f56054c.creativeList) != null && list3.size() > 1) {
                    C89070n.m154530a((List) list3, (Comparator) new C23701c());
                }
                throw th;
            }
        }
        if (document == null) {
            AbstractC23689c cVar4 = this.f56056e;
            if (cVar4 != null) {
                cVar4.mo39119e();
            }
            int i3 = this.f56053b - 1;
            this.f56053b = i3;
            if (i3 == 0 && (list2 = this.f56054c.creativeList) != null && list2.size() > 1) {
                C89070n.m154530a((List) list2, (Comparator) new C23699a());
            }
            return false;
        }
        boolean a = m44784a(document, i, 0);
        AbstractC23689c cVar5 = this.f56056e;
        if (cVar5 != null) {
            cVar5.mo39119e();
        }
        int i4 = this.f56053b - 1;
        this.f56053b = i4;
        if (i4 == 0 && (list = this.f56054c.creativeList) != null && list.size() > 1) {
            C89070n.m154530a((List) list, (Comparator) new C23700b());
        }
        return a;
    }

    /* renamed from: c */
    private final void m44789c(Node node, C23683b bVar) {
        boolean z;
        XPath xPath = this.f56052a;
        C89219l.m154716b(xPath, "");
        Iterator<Node> a = C23691b.m44778a(xPath, node, "./Linear/MediaFiles/MediaFile").mo2926a();
        while (a.hasNext()) {
            Node next = a.next();
            C23685d dVar = new C23685d();
            String evaluate = this.f56052a.evaluate("./@delivery", next);
            C89219l.m154716b(evaluate, "");
            Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.CharSequence");
            dVar.delivery = C89361p.m154910b((CharSequence) evaluate).toString();
            String evaluate2 = this.f56052a.evaluate("./@type", next);
            C89219l.m154716b(evaluate2, "");
            Objects.requireNonNull(evaluate2, "null cannot be cast to non-null type kotlin.CharSequence");
            dVar.type = C89361p.m154910b((CharSequence) evaluate2).toString();
            String evaluate3 = this.f56052a.evaluate("./text()", next);
            C89219l.m154716b(evaluate3, "");
            Objects.requireNonNull(evaluate3, "null cannot be cast to non-null type kotlin.CharSequence");
            dVar.url = C89361p.m154910b((CharSequence) evaluate3).toString();
            XPath xPath2 = this.f56052a;
            C89219l.m154716b(xPath2, "");
            String evaluate4 = xPath2.evaluate("./@bitrate", next);
            C89219l.m154716b(evaluate4, "");
            Objects.requireNonNull(evaluate4, "null cannot be cast to non-null type kotlin.CharSequence");
            Integer e = C89361p.m154863e(C89361p.m154910b((CharSequence) evaluate4).toString());
            if (e != null) {
                dVar.bitRate = e.intValue();
            }
            XPath xPath3 = this.f56052a;
            C89219l.m154716b(xPath3, "");
            String evaluate5 = xPath3.evaluate("./@width", next);
            C89219l.m154716b(evaluate5, "");
            Objects.requireNonNull(evaluate5, "null cannot be cast to non-null type kotlin.CharSequence");
            Integer e2 = C89361p.m154863e(C89361p.m154910b((CharSequence) evaluate5).toString());
            if (e2 != null) {
                dVar.width = e2.intValue();
            }
            XPath xPath4 = this.f56052a;
            C89219l.m154716b(xPath4, "");
            String evaluate6 = xPath4.evaluate("./@height", next);
            C89219l.m154716b(evaluate6, "");
            Objects.requireNonNull(evaluate6, "null cannot be cast to non-null type kotlin.CharSequence");
            Integer e3 = C89361p.m154863e(C89361p.m154910b((CharSequence) evaluate6).toString());
            if (e3 != null) {
                dVar.height = e3.intValue();
            }
            XPath xPath5 = this.f56052a;
            C89219l.m154716b(xPath5, "");
            String evaluate7 = xPath5.evaluate("./@scalable", next);
            C89219l.m154716b(evaluate7, "");
            Objects.requireNonNull(evaluate7, "null cannot be cast to non-null type kotlin.CharSequence");
            String obj = C89361p.m154910b((CharSequence) evaluate7).toString();
            if (obj.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                dVar.scalable = Boolean.valueOf(C89361p.m154872a("true", obj, true));
            }
            XPath xPath6 = this.f56052a;
            C89219l.m154716b(xPath6, "");
            String evaluate8 = xPath6.evaluate("./@maintainAspectRatio", next);
            C89219l.m154716b(evaluate8, "");
            Objects.requireNonNull(evaluate8, "null cannot be cast to non-null type kotlin.CharSequence");
            String obj2 = C89361p.m154910b((CharSequence) evaluate8).toString();
            if (obj2.length() > 0) {
                dVar.maintainAspectRatio = Boolean.valueOf(C89361p.m154872a("true", obj2, true));
            }
            bVar.mediaFileList = C23690a.m44774a(bVar.mediaFileList, dVar);
        }
    }

    /* renamed from: d */
    private final void m44791d(Node node, C23683b bVar) {
        XPath xPath = this.f56052a;
        C89219l.m154716b(xPath, "");
        Iterator<Node> a = C23691b.m44778a(xPath, node, "./Linear/Icons/Icon").mo2926a();
        while (a.hasNext()) {
            Node next = a.next();
            C23684c cVar = new C23684c();
            XPath xPath2 = this.f56052a;
            C89219l.m154716b(xPath2, "");
            String evaluate = xPath2.evaluate("./@width", next);
            C89219l.m154716b(evaluate, "");
            Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.CharSequence");
            Integer e = C89361p.m154863e(C89361p.m154910b((CharSequence) evaluate).toString());
            if (e != null) {
                cVar.width = e.intValue();
            }
            XPath xPath3 = this.f56052a;
            C89219l.m154716b(xPath3, "");
            String evaluate2 = xPath3.evaluate("./@height", next);
            C89219l.m154716b(evaluate2, "");
            Objects.requireNonNull(evaluate2, "null cannot be cast to non-null type kotlin.CharSequence");
            Integer e2 = C89361p.m154863e(C89361p.m154910b((CharSequence) evaluate2).toString());
            if (e2 != null) {
                cVar.width = e2.intValue();
            }
            cVar.program = this.f56052a.evaluate("./@program", next);
            XPath xPath4 = this.f56052a;
            C89219l.m154716b(xPath4, "");
            AbstractC89306h<Node> a2 = C23691b.m44778a(xPath4, next, "./StaticResource");
            XPath xPath5 = this.f56052a;
            C89219l.m154716b(xPath5, "");
            cVar.staticResource = C89309k.m154812f(C23691b.m44776a(a2, xPath5));
            XPath xPath6 = this.f56052a;
            C89219l.m154716b(xPath6, "");
            AbstractC89306h<Node> a3 = C23691b.m44778a(xPath6, next, "./HTMLResource");
            XPath xPath7 = this.f56052a;
            C89219l.m154716b(xPath7, "");
            cVar.htmlResource = (String) C89309k.m154808d(C23691b.m44776a(a3, xPath7));
            XPath xPath8 = this.f56052a;
            C89219l.m154716b(xPath8, "");
            AbstractC89306h<Node> a4 = C23691b.m44778a(xPath8, next, "./IFrameResource");
            XPath xPath9 = this.f56052a;
            C89219l.m154716b(xPath9, "");
            cVar.iFrameResource = (String) C89309k.m154808d(C23691b.m44776a(a4, xPath9));
            XPath xPath10 = this.f56052a;
            C89219l.m154716b(xPath10, "");
            AbstractC89306h<Node> a5 = C23691b.m44778a(xPath10, next, "./IconViewTracking");
            XPath xPath11 = this.f56052a;
            C89219l.m154716b(xPath11, "");
            cVar.viewTracking = C89309k.m154812f(C23691b.m44776a(a5, xPath11));
            XPath xPath12 = this.f56052a;
            C89219l.m154716b(xPath12, "");
            Iterator<Node> a6 = C23691b.m44778a(xPath12, next, "./IconClicks").mo2926a();
            while (a6.hasNext()) {
                cVar.clickList = C23690a.m44774a(cVar.clickList, mo39120a(a6.next()));
            }
            bVar.iconList = C23690a.m44774a(bVar.iconList, cVar);
        }
    }

    /* renamed from: a */
    public final boolean mo39121a(String str, int i) {
        List<C23683b> list;
        List<C23683b> list2;
        List<C23683b> list3;
        AbstractC23689c cVar = this.f56056e;
        if (cVar != null) {
            cVar.mo39113a();
        }
        this.f56053b++;
        Document document = null;
        try {
            AbstractC23681b bVar = this.f56055d;
            if (bVar == null) {
                bVar = C23678a.f56042a;
            }
            document = bVar.mo39104a(str);
        } catch (C23679a e) {
            AbstractC23689c cVar2 = this.f56056e;
            if (cVar2 != null) {
                cVar2.mo39114a(e);
            }
        } catch (C23680b e2) {
            AbstractC23689c cVar3 = this.f56056e;
            if (cVar3 != null) {
                cVar3.mo39115a(e2);
            }
        } catch (Throwable th) {
            AbstractC23689c cVar4 = this.f56056e;
            if (cVar4 != null) {
                cVar4.mo39119e();
            }
            int i2 = this.f56053b - 1;
            this.f56053b = i2;
            if (i2 == 0 && (list = this.f56054c.creativeList) != null && list.size() > 1) {
                C89070n.m154530a((List) list, (Comparator) new C23705g());
            }
            throw th;
        }
        if (document == null) {
            AbstractC23689c cVar5 = this.f56056e;
            if (cVar5 != null) {
                cVar5.mo39119e();
            }
            int i3 = this.f56053b - 1;
            this.f56053b = i3;
            if (i3 == 0 && (list3 = this.f56054c.creativeList) != null && list3.size() > 1) {
                C89070n.m154530a((List) list3, (Comparator) new C23703e());
            }
            return false;
        }
        boolean a = m44784a(document, i, 0);
        AbstractC23689c cVar6 = this.f56056e;
        if (cVar6 != null) {
            cVar6.mo39119e();
        }
        int i4 = this.f56053b - 1;
        this.f56053b = i4;
        if (i4 == 0 && (list2 = this.f56054c.creativeList) != null && list2.size() > 1) {
            C89070n.m154530a((List) list2, (Comparator) new C23704f());
        }
        return a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ C23698d(C23687f fVar, AbstractC23681b bVar, int i) {
        this(fVar, (i & 2) != 0 ? null : bVar, (AbstractC23689c) null);
    }

    public C23698d(C23687f fVar, AbstractC23681b bVar, AbstractC23689c cVar) {
        C89219l.m154721d(fVar, "");
        this.f56054c = fVar;
        this.f56055d = bVar;
        this.f56056e = cVar;
        this.f56052a = XPathFactory.newInstance().newXPath();
    }

    /* renamed from: a */
    private final boolean m44784a(Document document, int i, int i2) {
        int i3 = i - 1;
        String str = this.f56054c.version;
        if (str == null || str.length() == 0) {
            this.f56054c.version = this.f56052a.evaluate("/VAST/@version", document);
        }
        XPath xPath = this.f56052a;
        C89219l.m154716b(xPath, "");
        Iterator<Node> a = C23691b.m44778a(xPath, document, "/VAST/Ad/InLine").mo2926a();
        while (a.hasNext()) {
            Node next = a.next();
            AbstractC23689c cVar = this.f56056e;
            if (cVar != null) {
                cVar.mo39117c();
            }
            String str2 = this.f56054c.adSystem;
            if (str2 == null || str2.length() == 0) {
                C23687f fVar = this.f56054c;
                XPath xPath2 = this.f56052a;
                C89219l.m154716b(xPath2, "");
                AbstractC89306h<Node> a2 = C23691b.m44778a(xPath2, next, "./AdSystem");
                XPath xPath3 = this.f56052a;
                C89219l.m154716b(xPath3, "");
                fVar.adSystem = (String) C89309k.m154808d(C23691b.m44776a(a2, xPath3));
            }
            String str3 = this.f56054c.adTitle;
            if (str3 == null || str3.length() == 0) {
                C23687f fVar2 = this.f56054c;
                XPath xPath4 = this.f56052a;
                C89219l.m154716b(xPath4, "");
                AbstractC89306h<Node> a3 = C23691b.m44778a(xPath4, next, "./AdTitle");
                XPath xPath5 = this.f56052a;
                C89219l.m154716b(xPath5, "");
                fVar2.adTitle = (String) C89309k.m154808d(C23691b.m44776a(a3, xPath5));
            }
            String evaluate = this.f56052a.evaluate("./Description/text()", next);
            C89219l.m154716b(evaluate, "");
            Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.CharSequence");
            String obj = C89361p.m154910b((CharSequence) evaluate).toString();
            if (obj.length() > 0) {
                this.f56054c.description = obj;
            }
            m44783a(next, false);
            m44786b(next);
        }
        XPath xPath6 = this.f56052a;
        C89219l.m154716b(xPath6, "");
        Iterator<Node> a4 = C23691b.m44778a(xPath6, document, "/VAST/Ad/Wrapper").mo2926a();
        while (a4.hasNext()) {
            Node next2 = a4.next();
            m44783a(next2, true);
            m44786b(next2);
            if (!m44785a(next2, i3, i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m44785a(Node node, int i, int i2) {
        AbstractC23689c cVar;
        if (i < 0) {
            AbstractC23689c cVar2 = this.f56056e;
            if (cVar2 != null) {
                XPath xPath = this.f56052a;
                C89219l.m154716b(xPath, "");
                AbstractC89306h<Node> a = C23691b.m44778a(xPath, node, "./VASTAdTagURI");
                XPath xPath2 = this.f56052a;
                C89219l.m154716b(xPath2, "");
                Iterator<String> a2 = C23691b.m44776a(a, xPath2).mo2926a();
                while (a2.hasNext()) {
                    a2.next();
                    cVar2.mo39118d();
                }
            }
            return false;
        }
        XPath xPath3 = this.f56052a;
        C89219l.m154716b(xPath3, "");
        AbstractC89306h<Node> a3 = C23691b.m44778a(xPath3, node, "./VASTAdTagURI");
        XPath xPath4 = this.f56052a;
        C89219l.m154716b(xPath4, "");
        Iterator<String> a4 = C23691b.m44776a(a3, xPath4).mo2926a();
        boolean z = false;
        while (a4.hasNext()) {
            String next = a4.next();
            AbstractC23689c cVar3 = this.f56056e;
            if (cVar3 != null) {
                cVar3.mo39113a();
            }
            try {
                AbstractC23681b bVar = this.f56055d;
                if (bVar == null) {
                    bVar = C23678a.f56042a;
                }
                Document a5 = bVar.mo39104a(next);
                if (a5 == null) {
                    AbstractC23689c cVar4 = this.f56056e;
                    if (cVar4 != null) {
                        cVar4.mo39119e();
                    }
                    return false;
                } else if (!m44784a(a5, i, i2 + 1)) {
                    AbstractC23689c cVar5 = this.f56056e;
                    if (cVar5 != null) {
                        cVar5.mo39119e();
                    }
                    return false;
                } else {
                    AbstractC23689c cVar6 = this.f56056e;
                    if (cVar6 != null) {
                        cVar6.mo39119e();
                    }
                    z = true;
                }
            } catch (C23679a e) {
                AbstractC23689c cVar7 = this.f56056e;
                if (cVar7 != null) {
                    cVar7.mo39114a(e);
                }
            } catch (C23680b e2) {
                AbstractC23689c cVar8 = this.f56056e;
                if (cVar8 != null) {
                    cVar8.mo39115a(e2);
                }
            } catch (Throwable th) {
                AbstractC23689c cVar9 = this.f56056e;
                if (cVar9 != null) {
                    cVar9.mo39119e();
                }
                throw th;
            }
        }
        if (!z && (cVar = this.f56056e) != null) {
            cVar.mo39115a(new C23680b("VASTAdTagURI missing"));
        }
        return z;
    }
}

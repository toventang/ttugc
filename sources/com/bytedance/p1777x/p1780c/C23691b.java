package com.bytedance.p1777x.p1780c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1777x.p1778a.C23679a;
import com.bytedance.p1777x.p1778a.C23680b;
import java.io.ByteArrayInputStream;
import java.util.Objects;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;
import p4600h.p4621l.AbstractC89306h;
import p4600h.p4621l.C89297c;
import p4600h.p4621l.C89309k;
import p4600h.p4622m.C89338d;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.x.c.b */
public final class C23691b {
    static {
        Covode.recordClassIndex(27793);
    }

    /* renamed from: com.bytedance.x.c.b$c */
    static final class C23694c extends AbstractC89220m implements AbstractC89172b<Node, String> {

        /* renamed from: a */
        final /* synthetic */ XPath f56047a;

        static {
            Covode.recordClassIndex(27796);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23694c(XPath xPath) {
            super(1);
            this.f56047a = xPath;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Node node) {
            C89219l.m154721d(node, "");
            return this.f56047a.evaluate("./text()", node);
        }
    }

    /* renamed from: com.bytedance.x.c.b$a */
    static final class C23692a extends AbstractC89220m implements AbstractC89172b<String, String> {

        /* renamed from: a */
        public static final C23692a f56045a = new C23692a();

        static {
            Covode.recordClassIndex(27794);
        }

        C23692a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(String str) {
            String str2 = str;
            C89219l.m154716b(str2, "");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.CharSequence");
            return C89361p.m154910b((CharSequence) str2).toString();
        }
    }

    /* renamed from: com.bytedance.x.c.b$b */
    static final class C23693b extends AbstractC89220m implements AbstractC89172b<String, Boolean> {

        /* renamed from: a */
        public static final C23693b f56046a = new C23693b();

        static {
            Covode.recordClassIndex(27795);
        }

        C23693b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(String str) {
            boolean z;
            String str2 = str;
            C89219l.m154716b(str2, "");
            if (str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.x.c.b$d */
    public static final class C23695d extends AbstractC89220m implements AbstractC89172b<String, AbstractC89306h<? extends Node>> {

        /* renamed from: a */
        final /* synthetic */ XPath f56048a;

        /* renamed from: b */
        final /* synthetic */ Object f56049b;

        static {
            Covode.recordClassIndex(27797);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23695d(XPath xPath, Object obj) {
            super(1);
            this.f56048a = xPath;
            this.f56049b = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC89306h<? extends Node> invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            Object evaluate = this.f56048a.evaluate(str2, this.f56049b, XPathConstants.NODESET);
            if (!(evaluate instanceof NodeList)) {
                evaluate = null;
            }
            final NodeList nodeList = (NodeList) evaluate;
            if (nodeList == null) {
                return C89297c.f202938a;
            }
            return C89309k.m154810e(C89070n.m154598r(C89271h.m154766a(0, nodeList.getLength())), new AbstractC89172b<Integer, Node>() {
                /* class com.bytedance.p1777x.p1780c.C23691b.C23695d.C236961 */

                static {
                    Covode.recordClassIndex(27798);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ Node invoke(Integer num) {
                    return nodeList.item(num.intValue());
                }
            });
        }
    }

    /* renamed from: b */
    public static final Document m44780b(String str) {
        MethodCollector.m26663i(2791);
        C89219l.m154721d(str, "");
        try {
            byte[] bytes = str.getBytes(C89338d.f202990a);
            C89219l.m154716b(bytes, "");
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            try {
                Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(byteArrayInputStream);
                C89146c.m154636a(byteArrayInputStream, null);
                MethodCollector.m26664o(2791);
                return parse;
            } catch (Throwable th) {
                C89146c.m154636a(byteArrayInputStream, th);
                MethodCollector.m26664o(2791);
                throw th;
            }
        } catch (Throwable th2) {
            C23680b bVar = new C23680b(th2);
            MethodCollector.m26664o(2791);
            throw bVar;
        }
    }

    /* renamed from: a */
    public static final Document m44779a(String str) {
        C89219l.m154721d(str, "");
        try {
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(str);
        } catch (SAXException e) {
            throw new C23680b(e);
        } catch (Throwable th) {
            throw new C23679a(str, th);
        }
    }

    /* renamed from: a */
    public static final AbstractC89306h<String> m44776a(AbstractC89306h<? extends Node> hVar, XPath xPath) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(xPath, "");
        return C89309k.m154799a(C89309k.m154810e(C89309k.m154810e(hVar, new C23694c(xPath)), C23692a.f56045a), (AbstractC89172b) C23693b.f56046a);
    }

    /* renamed from: a */
    public static final AbstractC89306h<Node> m44777a(XPath xPath, Object obj, AbstractC89306h<String> hVar) {
        C89219l.m154721d(xPath, "");
        C89219l.m154721d(obj, "");
        C89219l.m154721d(hVar, "");
        return C89309k.m154807d(hVar, new C23695d(xPath, obj));
    }

    /* renamed from: a */
    public static final AbstractC89306h<Node> m44778a(XPath xPath, Object obj, String... strArr) {
        C89219l.m154721d(xPath, "");
        C89219l.m154721d(obj, "");
        C89219l.m154721d(strArr, "");
        return m44777a(xPath, obj, C89064i.m154514o(strArr));
    }
}

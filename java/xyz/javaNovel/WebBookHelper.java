package xyz.javaNovel;

import java.io.IOException;

/**
 * @author sidian
 * @date 2019/5/29 16:49
 */
public class WebBookHelper {
    public static void 斗破苍穹() throws IOException, InterruptedException {
        WebBookCrawler crawler=new WebBookCrawler("https://www.biqukan.com/3_3037/1349252.html",
                "#wrapper > div.book.reader > div.content > h1",
                "#content",
                "#wrapper > div.book.reader > div.content > div.page_chapter > ul > li:nth-child(3) > a",
                "斗破苍穹.txt");
        crawler.crawl();
    }

    public static void 姐妹花的最强兵王() throws IOException, InterruptedException {
        WebBookCrawler crawler=new WebBookCrawler("https://www.81xzw.com/book/148528/0.html",
                "body > div.novel > h1",
                "#content",
                "body > div.novel > div:nth-child(5) > a:nth-child(3)",
                "姐妹花的最强兵王.txt");
        crawler.crawl();
    }
    public static void 万古之王() throws IOException, InterruptedException {
        WebBookCrawler crawler=new WebBookCrawler("https://www.77nt.com/107143/34453791.html",
                ".title > h1:nth-child(1)",

                "#content34453791",
                "#xiazhang",
                "万古之王.txt");
        crawler.crawl();
    }
}

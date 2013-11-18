import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

/**
 * User: stanislav.skrebtsov (stanislav.skrebtsov@engagepoint.com)
 * Date: 11/15/13
 * Time: 3:50 PM
 */
public class BehaveExample extends JUnitStory {

    @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration()
                // Ишем истории в Classpath
                .useStoryLoader(new LoadFromClasspath(this.getClass()))
                        // Вывод в консоль и текстовый файл
                .useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(Format.CONSOLE, Format.TXT));
    }

    // Тут опишем наши классы с описанием шагов
    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new BehaveTests());
    }

}
/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/lambda/flatmap
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.lambda.flatmap;

import java.util.HashSet;
import java.util.Set;

public class Developer {

    private String name;
    private Set<String> languages;

    public Developer(String name) {
        this.languages = new HashSet<>();
        this.name = name;
    }

    public void add(String language) {
        this.languages.add(language);
    }

    public Set<String> getLanguages() {
        return languages;
    }
    
    public String getName() {
		return name;
	}
}
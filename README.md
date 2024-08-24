
---

# Project Overview

This project involves using a custom plugin to manage the generation of JaCoCo test reports across multiple modules.

## Plugin Integration

I attempted to pull in a plugin from another project using `mavenLocal`, but it was unsuccessful. The details of this attempt can be found in a separate branch `develop`.

## Module Dependencies

`core` module requires build (`./gradlew build`) to function properly, as it independently pulls in the necessary `.jar` file.

## JaCoCo Test Reports

To generate a JaCoCo test report, you can use the task `./gradlew jacocoRootReport`. This task will either run automatically during the build process.

### Task Details

The `jacocoRootReport` task disables HTML report generation in submodules to reduce the number of generated files. The report will show results for two submodules and the root module.

---
